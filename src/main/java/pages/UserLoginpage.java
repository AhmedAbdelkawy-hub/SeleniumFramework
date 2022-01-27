package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserLoginpage {
	WebDriver driver;

	// Create constructor
	public UserLoginpage(WebDriver driver) {
		this.driver = driver;
	}

	// Locator

	By Email = By.id("Email");
	By Password = By.id("Password");
	By LoginBtn = By.cssSelector("button.button-1.login-button");

	// Login Methods

	public boolean IsLoginBtnDisplay() {

		return driver.findElement(LoginBtn).isDisplayed();
	}

	public void UserLogin(String email, String password) {
		driver.findElement(Email).sendKeys(email);
		driver.findElement(Password).sendKeys(password);
		driver.findElement(LoginBtn).click();
	}

}
