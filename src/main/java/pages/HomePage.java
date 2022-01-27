package pages;

import java.util.List;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	 WebDriver driver;
	

// create constructor 
	public HomePage(WebDriver driver) {
	
		this.driver = driver;
		
	}
     // Variable
	// Locator
	By RegisterLink = By.linkText("Register");
	By LoginLink = By.linkText("Log in");
	By MyacountLink = By.cssSelector("a.ico-account");
	By SearchTextBox = By.id("small-searchterms");
	By SearchBtn = By.cssSelector("button.button-1.search-box-button");
	By ProductList = By.id("ui-id-1");
	By ContuctUsBtn = By.linkText("Contact us");
	By CurrencySelector = By.id("customerCurrency");
	//By CurrencyEuro = By.xpath("//option[@value = 'https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F']");
	By ComputersMenu = By.xpath("//a[@href = '/computers']");
	By Desktoplink = By.xpath("//a[@href = '/desktops']");
	
	// keywords /action/ methods

	// click register link method
	public void ClickRegisterLink() {
		driver.findElement(RegisterLink).click();
	}

	// Click login method
	public void ClickLoginLink() {
		driver.findElement(LoginLink).click();
	}

	//
	public boolean IsLoginLinkIsDisplay() {
		return driver.findElement(LoginLink).isDisplayed();

	}

	// Click my account method
	public void ClickMyaccountLink() {
		driver.findElement(MyacountLink).click();
	}

// product search from search button 
	public void ProductSearch(String ProductName) {
		driver.findElement(SearchTextBox).sendKeys(ProductName);
		driver.findElement(SearchBtn).click();
	}

	// product Automatic search auto suggest
	public void ProductSearchUsingAutomaSuggest(String ProductName) {

		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(SearchTextBox)));
		wait.until(ExpectedConditions.elementToBeClickable(SearchTextBox));
		// action
		driver.findElement(SearchTextBox).sendKeys(ProductName);
		// Wait
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(ProductList)));
		wait.until(ExpectedConditions.elementToBeClickable(ProductList));
		// action
		driver.findElements(ProductList).get(0).click();
	}
	 
	// Scroll Down method 
		public void ScrollDownHomPage() {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",driver.findElement(ContuctUsBtn));
				
		}
		
	// Contact us 
	public void OpenContactUsPage() {
		driver.findElement(ContuctUsBtn).click();
	}
  // Change currency
	public void ChangeCurrency() {
		// Wait
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(CurrencySelector)));
//		wait.until(ExpectedConditions.elementToBeClickable(CurrencySelector));
//		// action
//		driver.findElement(CurrencySelector).click();
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(CurrencyEuro)));
//		wait.until(ExpectedConditions.elementToBeClickable(CurrencyEuro));
//		// action
//		driver.findElement(CurrencyEuro).click();
		
		Select selectoptions = new Select(driver.findElement(CurrencySelector));
		selectoptions.selectByIndex(1);
	}
	// Hover Menu 
		public void HoverMenuComputers() {
		WebElement ComputerMenuConvert = driver.findElement(ComputersMenu);	
		WebElement DesktoplinkConvert = driver.findElement(Desktoplink);	
		Actions Actionobj = new Actions(driver);
		Actionobj.moveToElement(ComputerMenuConvert);
		Actionobj.moveToElement(DesktoplinkConvert);
		Actionobj.click().build().perform();
		
		}
}
