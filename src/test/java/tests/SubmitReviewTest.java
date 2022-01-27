package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AddReviewProjectPage;
import pages.HomePage;
import pages.ProductEmailToFriendPage;
import pages.ProductReviewDetailsPage;
import pages.SearchResultProductDetailsPage;
import pages.UserLoginpage;

public class SubmitReviewTest extends TestPase {

	
	
	private HomePage HomePageobject;
	private AddReviewProjectPage AddReviewProjectPageeobject;
	private ProductReviewDetailsPage ProductReviewDetailsPageobject;
	private UserLoginpage UserLoginPageobject;
	private SearchResultProductDetailsPage SearchResultProductDetailsPageobject;
	// variable
	private String reviewText = "elkawy1";
	private String reviewTitle = "tetrttttt";
	private String SuccessMessag = "Product review is successfully added";
	
	//Tests
	@Test
	  public void UsercanSendEmailProduct() {
		UserLoginPageobject = new UserLoginpage(driver);
		HomePageobject = new HomePage(driver);
		AddReviewProjectPageeobject = new AddReviewProjectPage(driver); 
		ProductReviewDetailsPageobject = new ProductReviewDetailsPage(driver);
		SearchResultProductDetailsPageobject = new SearchResultProductDetailsPage(driver);
		UserLoginPageobject = new UserLoginpage(driver);
		HomePageobject = new HomePage(driver);
	     HomePageobject.ClickLoginLink();
	     UserLoginPageobject.UserLogin("elkawy1@gmail.com", "test1234");
	     HomePageobject.ProductSearchUsingAutomaSuggest("MacBook" );
	     SearchResultProductDetailsPageobject.ClickReviewLink();
		 AddReviewProjectPageeobject.SubmitReview(reviewTitle, reviewText);
		 Assert.assertTrue(ProductReviewDetailsPageobject.GetSucessMessag().contains(SuccessMessag));
		
	}
}
