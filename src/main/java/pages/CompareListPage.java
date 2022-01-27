package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompareListPage {

	
	private WebDriver driver;

	// Create constructor
	public CompareListPage (WebDriver driver) {
		this.driver = driver;

	}
	//Locators
	    By Comparetabes = By.linkText("table.compare-products-table");
		By ProdcutName1 = By.linkText("Asus N551JK-XO076H Laptop");
		By ProdcutName2 = By.linkText("Apple MacBook Pro 13-inch");
		
		//Methods
		//Get Product in wish list name
		public boolean GetCompareListPrductsName() {
			//return driver.findElement(ProdcutName1).getText();
			//return driver.findElement(ProdcutName2).getText();
			//driver.findElement(ProdcutName1).isDisplayed();
			return driver.findElement(ProdcutName2).isDisplayed();
		
		}
}
