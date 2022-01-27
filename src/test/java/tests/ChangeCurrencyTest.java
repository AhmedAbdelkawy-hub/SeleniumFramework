package tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SearchResultProductDetailsPage;

public class ChangeCurrencyTest extends TestPase {

	private HomePage homePageobject;
	private SearchResultProductDetailsPage SearchResultProductDetailsPageobject;
//Tests
	@Test
	public void UserCanChangeCurrency() {
		homePageobject = new HomePage(driver);
		homePageobject.ChangeCurrency();
		homePageobject.ProductSearchUsingAutomaSuggest("MacBook");
		SearchResultProductDetailsPageobject = new SearchResultProductDetailsPage(driver);
		Assert.assertTrue(SearchResultProductDetailsPageobject.GetProductCurrency().contains("€"));
		
	}
}
