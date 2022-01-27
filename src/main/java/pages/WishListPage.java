package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishListPage {
	private WebDriver driver;

	// Create constructor
	public WishListPage (WebDriver driver) {
		this.driver = driver;

	}
	
	//Locators
	By WishListProductName = By.linkText("Apple MacBook Pro 13-inch");
	
	//Methods
	//Get Product in wish list name
	public String WishListPrductName() {
		return driver.findElement(WishListProductName).getText();
	}
}
