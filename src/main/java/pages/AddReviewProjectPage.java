package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddReviewProjectPage {

	
	
	private WebDriver driver;

	// Create constructor
	public AddReviewProjectPage (WebDriver driver) {
		this.driver = driver;

	}
	
	// Locator
	By ReviewTitle = By.id("AddProductReview_Title");
	By ReviewText = By.id("AddProductReview_ReviewText");
	By Rating = By.id("addproductrating_1");
	By SubmitReviewBtn = By.cssSelector("button.button-1.write-product-review-button");
	
	// Methods 
	// user can submit review 
	public void  SubmitReview(String reviewTitle, String reviewText) {
		driver.findElement(ReviewTitle).sendKeys(reviewTitle);
		driver.findElement(ReviewText).sendKeys(reviewText);
		driver.findElement(Rating).click();
		driver.findElement(SubmitReviewBtn).click();
	}
}
