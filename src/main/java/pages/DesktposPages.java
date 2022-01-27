package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DesktposPages {

	
	
	WebDriver driver;

	// create constructor 
		public DesktposPages(WebDriver driver) {

			this.driver = driver;
		}
	     // Variable
		// Locator
		By DesktopTextPage = By.cssSelector("div.page-title");
		// Methods
		// Get desktop text 
		public String GetDesktopText() {
			return driver.findElement(DesktopTextPage).getText();
		} 
}
