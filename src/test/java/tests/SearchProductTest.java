package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SearchResultAllProductPage;

public class SearchProductTest extends TestPase {
	
	private SearchResultAllProductPage SearchPageobject;
	private HomePage HomePageobject;
	
 // Variable
	String ProductName = "Apple MacBook Pro 13-inch"; 
	
// Tests 
	@Test
	public void UserCanSearchProduct() {
		SearchPageobject = new SearchResultAllProductPage(driver);
		HomePageobject = new HomePage(driver);
		HomePageobject.ProductSearch(ProductName);
		SearchPageobject.ProductSearchISDisplay();
		Assert.assertEquals(SearchPageobject.ProductSearchISDisplay(), ProductName);
		
		
		
	}
}
