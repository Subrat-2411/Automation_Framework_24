package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//input[@id='Email']")
	private WebElement emailTextField;
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement passwordTextField ;
	
	@FindBy(xpath="//input[@id='RememberMe']")
	private WebElement rememberMeCheckBox;
	
	@FindBy(xpath="//a[contains(text(),'Forgot')]")
	private WebElement forgotPasswordLink;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement loginButton ;
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getRememberMeCheckBox() {
		return rememberMeCheckBox;
	}

	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
	
}
