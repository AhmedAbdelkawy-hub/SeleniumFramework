package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductReviewDetailsPage {
	
		
		private WebDriver driver;

		// Create constructor
		public ProductReviewDetailsPage (WebDriver driver) {
			this.driver = driver;

		}
		
		// locator
		By SuccessMessage = By.cssSelector("div.result");
		
		// Methods
		// get sucess message 
		
		public String GetSucessMessag() {
			return driver.findElement(SuccessMessage).getText();
		}
}
