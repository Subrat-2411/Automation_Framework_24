package genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import objectrepository.HomePage;
import objectrepository.LoginPage;
import objectrepository.WelcomePage;

public class BaseClass {
	public static ExtentReports eReport;

	public static ExtentTest test;

	public static WebDriver driver;

	public JavaUtility jutil = new JavaUtility();

	public WebDriverUtility wutil = new WebDriverUtility();

	public FileUtility futil = new FileUtility();

	/**
	 * This method is used to configure the report.
	 */
	@BeforeSuite
	public void reportConfiguration() {

		ExtentSparkReporter spark = new ExtentSparkReporter(
				"./HTML_reports/ExtentReport_" + jutil.getSystemTime() + ".html");

		eReport = new ExtentReports();

		eReport.attachReporter(spark);
	}

	/**
	 * This method is used to open the browser and navigate to the application.
	 * 
	 * @throws IOException
	 */
	@BeforeClass
	public void openBrowser() throws IOException {

	//	WebDriver driver = null;

		String browser = System.getProperty("browser");

		if (browser.equals("chrome"))
			driver = new ChromeDriver();

		else if (browser.equals("firefox"))
			driver = new FirefoxDriver();

		else
			driver = new ChromeDriver();
		
		wutil.maximize(driver);

		//driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get(futil.getDataFromProperty("url"));
	}

	/**
	 * This method is used to login to the Application.
	 * 
	 * @throws IOException
	 */
	@BeforeMethod
	public void login() throws IOException {
		WelcomePage wp = new WelcomePage(driver);

		wp.getLoginLink().click();

		LoginPage lp = new LoginPage(driver);

		lp.getEmailTextField().sendKeys(futil.getDataFromProperty("email"));

		lp.getPasswordTextField().sendKeys(futil.getDataFromProperty("password"));

		lp.getLoginButton().click();
	}

	/**
	 * This method is used to perform Log Out operation.
	 */
	@AfterMethod
	public void logout() {
		HomePage hp = new HomePage(driver);

		hp.getLogoutLink().click();
	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

	/**
	 * This method is used for report backup.
	 */
	@AfterSuite
	public void reportBackUp() {
		eReport.flush();
	}
}
