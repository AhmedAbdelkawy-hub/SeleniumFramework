package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {

	
	WebDriver driver;

	// create constructor 
	      public LogoutPage(WebDriver driver ) {
		
	    	this.driver = driver;
	}
	      
	      // Locator 
	      By LogoutBtn = By.cssSelector("a.ico-logout");
	      
	      
	      //methods
	      public boolean IslogoutBtnIsDisplay() {
	    	  return driver.findElement(LogoutBtn).isDisplayed();
	      }
	      
	    //methods
	      public void UserLogOut() {
	    	   driver.findElement(LogoutBtn).click();
	      }
}
