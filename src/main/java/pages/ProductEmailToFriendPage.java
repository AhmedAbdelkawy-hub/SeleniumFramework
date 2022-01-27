package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductEmailToFriendPage {

	WebDriver driver;

	public ProductEmailToFriendPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	// Locators
	By FriendsEmail = By.id("FriendEmail");
	By YourEmail = By.id("YourEmailAddress");
	By Message = By.id("PersonalMessage");
	By SendEmailBtn = By.name("send-email");
	By SuccessMessag = By.cssSelector("div.result");
	
	// Methods
	// Send product to friend email
	public void SendProductToEmailFriend(String friendEmail,String yourEmail, String message) {
		driver.findElement(FriendsEmail).sendKeys(friendEmail);
		driver.findElement(YourEmail).clear();
		driver.findElement(YourEmail).sendKeys(yourEmail);
		driver.findElement(Message).sendKeys(message);
		driver.findElement(SendEmailBtn).click();
	}
	// get success message after sent product to email
	public String GetSuccessMessage() {
		return driver.findElement(SuccessMessag).getText();
	}
}
