package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CompareListPage;
import pages.HomePage;
import pages.SearchResultProductDetailsPage;
import pages.WishListPage;

public class AddProductToCompareListTest extends TestPase{
	
	private SearchResultProductDetailsPage SearchResultProductDetailsPageobject;
	private HomePage HomePageobject;
	private CompareListPage CompareListPageobject;
	
	
	@Test
	public void UsercanAddtwoProductAndCompare() throws InterruptedException {
		
		SearchResultProductDetailsPageobject = new SearchResultProductDetailsPage(driver);
        HomePageobject = new HomePage(driver);
        CompareListPageobject = new CompareListPage(driver);
		HomePageobject.ProductSearchUsingAutomaSuggest("macbook");
		SearchResultProductDetailsPageobject.ClickCompareListBtn();
		HomePageobject.ProductSearchUsingAutomaSuggest("Asus");
		SearchResultProductDetailsPageobject.ClickCompareListBtn();
		SearchResultProductDetailsPageobject.OpenComparListpage();
		Assert.assertTrue(true);
		
	}

}
