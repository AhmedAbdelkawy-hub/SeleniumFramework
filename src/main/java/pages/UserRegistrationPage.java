package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserRegistrationPage {
	WebDriver driver;

	// Create constructor
	public UserRegistrationPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locator
	By GenderRdoBtn = By.id("gender-male");
	By FirstName = By.id("FirstName");
	By LastName = By.id("LastName");
	By Email = By.id("Email");
	By Password = By.id("Password");
	By ConfPass = By.id("ConfirmPassword");
	By RegisterBtn = By.id("register-button");
	By RegisterMessSuccessLable = By.cssSelector("div.result");

	// Methods
	// Registration methods
	public boolean IsRegistrationBtnDisplay() {

		return driver.findElement(RegisterBtn).isDisplayed();
	}

	public void userRegisration(String firstName, String lastName, String email, String password) {

		driver.findElement(GenderRdoBtn).click();
		driver.findElement(FirstName).sendKeys(firstName);
		driver.findElement(LastName).sendKeys(lastName);
		driver.findElement(Email).sendKeys(email);
		driver.findElement(Password).sendKeys(password);
		driver.findElement(ConfPass).sendKeys(password);
		driver.findElement(RegisterBtn).click();
	}

	public String GetRgisterMessSuccess() {

		return driver.findElement(RegisterMessSuccessLable).getText();
	}

}
