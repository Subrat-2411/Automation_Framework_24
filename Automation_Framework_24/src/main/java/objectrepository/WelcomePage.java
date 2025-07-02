package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	@FindBy(xpath="//a[text()='Register']")
	private WebElement registerLink;
	
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement loginLink;
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shoppingCartLink;
	
	@FindBy(xpath="//span[text()='Wishlist']")
	private WebElement wishListLink;
	
	@FindBy(xpath="(//input[contains(@value,'Search')])[1]")
	private WebElement searchTextField;
	
	public WelcomePage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public WebElement getWishListLink() {
		return getWishListLink();
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}
	
	
}
