package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;

public class SearchResultAllProductPage {
	private WebDriver driver;

	// Create constructor
	public SearchResultAllProductPage(WebDriver driver) {
		this.driver = driver;

	}
	
	// Locator
		//By ProductNameResults = By.xpath("//img[@alt='Picture of Apple MacBook Pro 13-inch']");
	By ProductNameResults = By.linkText("Apple MacBook Pro 13-inch");
	
		// Methods
		// Product Search ISDisplay
		public String ProductSearchISDisplay() {
			return driver.findElement(ProductNameResults).getText();
		}
		// Product Search ISDisplay
				public void ClickProductSearch() {
					 driver.findElement(ProductNameResults).click();
				}
	
	
	

}
