package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.bytebuddy.asm.Advice.This;

public class MyaccountPage {
	WebDriver driver;

	// Create constructor
	public MyaccountPage(WebDriver driver) {
		this.driver = driver;
	}

	// locators
	By ChangePasswordLink = By.linkText("Change password");

	// GetCurrentPageUrl methos
	public String GetMyAccountPageUrl() {

		return driver.getCurrentUrl();

	}

	// Click Change Password Link Method
	public void ClickChangePassword() {

		driver.findElement(ChangePasswordLink).click();

	}

}
