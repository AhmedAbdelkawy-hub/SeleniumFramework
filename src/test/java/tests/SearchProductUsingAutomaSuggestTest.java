package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SearchResultAllProductPage;
import pages.SearchResultProductDetailsPage;

public class SearchProductUsingAutomaSuggestTest extends TestPase {
	
	private SearchResultProductDetailsPage SearchResultProductDetailsPageobject;
	private HomePage HomePageobject;
	
 // Variable
	String ProductName = "Apple MacBook Pro 13-inch"; 
	
// Tests 
	@Test
	public void UUserCanSearchUsingAutomaSuggest() {
		SearchResultProductDetailsPageobject = new SearchResultProductDetailsPage(driver);
		HomePageobject = new HomePage(driver);
		
		HomePageobject.ProductSearchUsingAutomaSuggest(ProductName);
		Assert.assertEquals(SearchResultProductDetailsPageobject.ProductSearchISDisplay(), ProductName);
	}
			
}
