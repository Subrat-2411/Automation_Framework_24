package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="(//a[contains(text(),'Books')])[1]")
	private WebElement booksLink;
	
	@FindBy(xpath="(//a[contains(text(),'Computers')])[1]")
	private WebElement computersLink;
	
	@FindBy(xpath="(//a[contains(text(),'Electronics')])[1]")
	private WebElement electronicsLink;
	
	@FindBy(xpath="(//a[contains(text(),'Apparel')])[1]")
	private WebElement apparelAndShoesLink;
	
	@FindBy(xpath="(//a[contains(text(),'Digital ')])[1]")
	private WebElement digitalDownloadsLink;
	
	@FindBy(xpath="(//a[contains(text(),'Jewelry')])[1]")
	private WebElement jewelryLink;
	
	@FindBy(xpath="//a[text()='Log out']")
	private WebElement logoutLink;
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	public WebElement getApparelAndShoesLink() {
		return apparelAndShoesLink;
	}

	public WebElement getDigitalDownloadsLink() {
		return digitalDownloadsLink;
	}

	public WebElement getJewelryLink() {
		return jewelryLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	
}
