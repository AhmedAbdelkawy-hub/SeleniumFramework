package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {

	WebDriver driver;
	// Create Constructor

	public ContactUsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Locators
	By Name = By.id("FullName");
	By Email = By.id("Email");
	By Enquiry = By.id("Enquiry");
	By SubmitBtn = By.name("send-email");
	By SuccessMessageEnquiry = By.cssSelector("div.result");
	
	
	
	// Methods
	// Submit Enquiry
	public void SubmitEnquiry(String name,String email, String enquiry) {
		driver.findElement(Name).sendKeys(name);
		driver.findElement(Email).sendKeys(email);
		driver.findElement(Enquiry).sendKeys(enquiry);
		driver.findElement(SubmitBtn).click();
	}
	
	// Get Sucess mesage after Enquiry
	public String SucessMessageEnquiry() {
		return driver.findElement(SuccessMessageEnquiry).getText();
	}
}

