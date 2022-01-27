package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultProductDetailsPage {

	private WebDriver driver;

	// Create constructor
	public SearchResultProductDetailsPage (WebDriver driver) {
		this.driver = driver;

	}
	
	// Locator
            By ProductNameDetailsResult = By.cssSelector("strong.current-item");
            By EmailAfriend = By.cssSelector("button.button-2.email-a-friend-button");
            By ProductCuurency = By.cssSelector("div.product-price");
            By AddReviewLink = By.linkText("Add your review");
            By AddToWishListBtn = By.id("add-to-wishlist-button-4");
            By WishListLink= By.cssSelector("a.ico-wishlist");
            By AddToCompareListLink= By.cssSelector("button.button-2.add-to-compare-list-button");
            By ProductComparsonLink= By.linkText("Compare products list");
            By AddToCardBtn = By.id("add-to-cart-button-4");
            By ShoppingCardLink= By.linkText("Shopping cart");
            
	
		// Methods
		// Product Search ISDisplay
            public String ProductSearchISDisplay() {
    			return driver.findElement(ProductNameDetailsResult).getText();
    		}
		
            
         //  Click email a friend button 
            public void ClickEmailAFriend() {
    			 driver.findElement(EmailAfriend).click();
    		}
            
        //  Get Product Currnecy
            public String GetProductCurrency() {
    			 return driver.findElement(ProductCuurency).getText();
    		}
        //  Click Reiew Link
            public void ClickReviewLink() {
    			  driver.findElement(AddReviewLink).click();
    		}
        //  Click Add to wish list button
            public void ClickWishListBtn() {
    			  driver.findElement(AddToWishListBtn).click();
    		}
        //  open WishListPage
            public void OpenWishListpage() {
    			  driver.findElement(WishListLink).click();
    		
            }     

//  Click Add to compare list button
    public void ClickCompareListBtn() {
		  driver.findElement(AddToCompareListLink).click();
	}
    
//  opencomparListPage
    public void OpenComparListpage() throws InterruptedException{
    	

               Thread.sleep(5000);
	
		  driver.findElement(ProductComparsonLink).click();
	
    }
    
    // Click Add To Card Button
    public void ClickOnAddToCardBtn() {
    	
    	driver.findElement(AddToCardBtn).click();
    }
 // open Shopping card Page
    public void OpenShoppingCardPage() {
    	
    	driver.findElement(ShoppingCardLink).click();
    }
}
