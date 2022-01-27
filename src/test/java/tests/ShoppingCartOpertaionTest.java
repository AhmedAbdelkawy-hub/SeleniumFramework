package tests;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SearchResultProductDetailsPage;
import pages.ShopiingCardPage;

public class ShoppingCartOpertaionTest extends TestPase{
	
	private SearchResultProductDetailsPage SearchResultProductDetailsPageobject;
	private HomePage HomePageobject;
	private ShopiingCardPage ShopiingCardPageobject;
	private String NewQuantity = "6";
	
	
	@Test
	//Add product to cart
	public void UserCanAddProductToCart() {
		
		SearchResultProductDetailsPageobject = new SearchResultProductDetailsPage(driver);
		HomePageobject = new HomePage(driver);
		ShopiingCardPageobject = new ShopiingCardPage(driver);
		HomePageobject.ProductSearchUsingAutomaSuggest("macbook");
		SearchResultProductDetailsPageobject.ClickOnAddToCardBtn();
		SearchResultProductDetailsPageobject.OpenShoppingCardPage();
		Assert.assertTrue(ShopiingCardPageobject.GetProductName().contains("Apple MacBook Pro 13-inch"));
	}
	@Test
	// delete product from cart 
	public void UserCanDeleteProductfromCart() {
		
		SearchResultProductDetailsPageobject = new SearchResultProductDetailsPage(driver);
		HomePageobject = new HomePage(driver);
		ShopiingCardPageobject = new ShopiingCardPage(driver);
		HomePageobject.ProductSearchUsingAutomaSuggest("macbook");
		SearchResultProductDetailsPageobject.ClickOnAddToCardBtn();
		SearchResultProductDetailsPageobject.OpenShoppingCardPage();
		ShopiingCardPageobject.RemoveProductfromCart();
		Assert.assertTrue(ShopiingCardPageobject.GetSucessMessagRemoveProductfromCart().contains("Your Shopping Cart is empty!"));
	}
	@Test
	// update product from cart 
	public void UserCanUpdateProductfromCart() throws InterruptedException {
		
		SearchResultProductDetailsPageobject = new SearchResultProductDetailsPage(driver);
		HomePageobject = new HomePage(driver);
		ShopiingCardPageobject = new ShopiingCardPage(driver);
		HomePageobject.ProductSearchUsingAutomaSuggest("macbook");
		SearchResultProductDetailsPageobject.ClickOnAddToCardBtn();
		SearchResultProductDetailsPageobject.OpenShoppingCardPage();
		ShopiingCardPageobject.UpdateQuantayOffCart(NewQuantity);
		ShopiingCardPageobject.ClickOnUpdateBtn();
		//Assert.assertEquals(ShopiingCardPageobject.GetQuantayOffCart(),NewQuantity);
		//Assert.assert( ShopiingCardPageobject.GetQuantayOffCart(), NewQuantity);
		//Assert.assertTrue(ShopiingCardPageobject.GetQuantayOffCart().contains(NewQuantity));
	}
	

}
