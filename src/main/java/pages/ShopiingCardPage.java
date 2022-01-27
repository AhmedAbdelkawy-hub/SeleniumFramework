package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopiingCardPage {

	
	private static final String String = null;
	private WebDriver driver;

	// Create constructor
	public ShopiingCardPage (WebDriver driver) {
		this.driver = driver;


	}
	
	//Locators 
	By ProductName = By.cssSelector("a.product-name"); 
	By RemoveProduct = By.cssSelector("td.remove-from-cart");
	By SuccessMessagRemoveProduct = By.cssSelector("div.no-data");
	//By QuantityProductOnCart = By.cssSelector("td.quantity");  
	//By QuantityProductOnCart = By.xpath("//input[@id='itemquantity11222']");
	By QuantityProductOnCart = By.cssSelector("input.qty-input");
	By UpdateCardBtn = By.cssSelector("button.button-2.update-cart-button");
	
	
	//Methods
	//Add product To card 
	public String GetProductName() {
		return driver.findElement(ProductName).getText();
	}
	
	//Remove product from card
		public void RemoveProductfromCart() {
			 driver.findElement(RemoveProduct).click();
		}
		
		// success messga Remove product from card
				public String GetSucessMessagRemoveProductfromCart() {
					return driver.findElement(SuccessMessagRemoveProduct).getText();
				}
				
				// set quantity of cart
				public  void UpdateQuantayOffCart(String Quantity) throws InterruptedException {
		             
					//WebDriverWait wait = new WebDriverWait(driver, 100);
					//wait.until(ExpectedConditions.visibilityOf(driver.findElement(QuantityProductOnCart)));
					//wait.until(ExpectedConditions.elementToBeClickable(QuantityProductOnCart));
				
					 //driver.findElement(QuantityProductOnCart).click();
					driver.findElement(QuantityProductOnCart).clear();
					 driver.findElement(QuantityProductOnCart).sendKeys(Quantity);
				}
				
				// update card
				public void ClickOnUpdateBtn() {
					driver.findElement(UpdateCardBtn).click();
				}
				
				// get Quantity from cart
				public  String GetQuantayOffCart() {
					 //return driver.findElement(QuantityProductOnCart).getText();
					 return driver.findElement(QuantityProductOnCart).getText().toString();
					 //return driver.findElement(QuantityProductOnCart).getCssValue("input.qty-input");
					//return driver.findElement(QuantityProductOnCart).getCssValue(null);
				}
}
