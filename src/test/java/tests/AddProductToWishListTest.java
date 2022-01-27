package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SearchResultProductDetailsPage;
import pages.WishListPage;

public class AddProductToWishListTest extends TestPase {

	private WishListPage WishListPageobject;
	private SearchResultProductDetailsPage SearchResultProductDetailsPageobject;
	private HomePage HomePageobject;
	
	
	@Test
	public void AddProductToWishList() {
		
		SearchResultProductDetailsPageobject = new SearchResultProductDetailsPage(driver);
		WishListPageobject = new WishListPage(driver);
        HomePageobject = new HomePage(driver);
		HomePageobject.ProductSearchUsingAutomaSuggest("macbook");
		SearchResultProductDetailsPageobject.ClickWishListBtn();
		SearchResultProductDetailsPageobject.OpenWishListpage();
		Assert.assertTrue(WishListPageobject.WishListPrductName().contains("Apple MacBook Pro 13-inch"));
		
	}
}

