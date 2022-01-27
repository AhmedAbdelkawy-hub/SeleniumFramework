package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ContactUsPage;
import pages.HomePage;
import pages.LogoutPage;
import pages.ProductEmailToFriendPage;
import pages.SearchResultProductDetailsPage;
import pages.UserLoginpage;
import pages.UserRegistrationPage;

public class EmailProductToFriendTest extends TestPase{
	private HomePage HomePageobject;
	private ProductEmailToFriendPage ProductEmailToFriendPageobject;
	private SearchResultProductDetailsPage SearchResultProductDetailsPageobject;
	private UserLoginpage UserLoginPageobject;
	// variable
	String ProductName = "Apple MacBook Pro 13-inch"; 
	private String friendEmail = "elkawy1@gmail.com";
	private String yourEmail = "ali@gmail.com";
	private String message = "test";
	private String SuccessMessag = "Your message has been sent";
	private String eemail = "ali@gmail.com";
	
	//Tests
	@Test
	  public void UsercanSendEmailProduct() {
		UserLoginPageobject = new UserLoginpage(driver);
		HomePageobject = new HomePage(driver);
		SearchResultProductDetailsPageobject = new SearchResultProductDetailsPage(driver); 
	    ProductEmailToFriendPageobject = new ProductEmailToFriendPage(driver);
		HomePageobject.ProductSearchUsingAutomaSuggest(ProductName );
		UserLoginPageobject = new UserLoginpage(driver);
		HomePageobject = new HomePage(driver);
	     HomePageobject.ClickLoginLink();
		 UserLoginPageobject.UserLogin(eemail, "test1234");
		SearchResultProductDetailsPageobject.ClickEmailAFriend();
		ProductEmailToFriendPageobject.SendProductToEmailFriend(friendEmail,"ali@gmail.com",message);
		Assert.assertTrue(ProductEmailToFriendPageobject.GetSuccessMessage().contains(SuccessMessag));
	}

}
