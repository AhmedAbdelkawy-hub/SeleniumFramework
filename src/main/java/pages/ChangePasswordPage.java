package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangePasswordPage {

	WebDriver driver;

	// Create constructor
	public ChangePasswordPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// locators
	By OldPasswordField = By.id("OldPassword");
	By NewPasswordField = By.id("NewPassword");
	By ConfirmPasswordField = By.id("ConfirmNewPassword");
	By changePasswordBtn = By.xpath("//button[@class =\"button-1 change-password-button\"]");
	By ChangePasswordSuccessMessage =By.cssSelector("p.content");

	
	
	// GetCurrentPageUrl methos
		public String GetChangePassPageUrl() {

			return driver.getCurrentUrl();

		}
	//  Change Password Method
		public void UserCanChangePassword(String OldPasswordValue, String NewPasswordValue,String ConfirmPasswordValue) {
			
			driver.findElement(OldPasswordField).sendKeys(OldPasswordValue);
			driver.findElement(NewPasswordField).sendKeys(NewPasswordValue);
			driver.findElement(ConfirmPasswordField).sendKeys(ConfirmPasswordValue);
			driver.findElement(changePasswordBtn).click();
			
		}
		//GetChangPassMessSuccess Method
		public String GetChangePassMessSuccess() {

			return driver.findElement(ChangePasswordSuccessMessage).getText();
		}
}
