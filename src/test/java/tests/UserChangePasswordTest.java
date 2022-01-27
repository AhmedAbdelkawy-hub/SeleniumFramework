package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ChangePasswordPage;
import pages.HomePage;
import pages.LogoutPage;
import pages.MyaccountPage;
import pages.UserLoginpage;

public class UserChangePasswordTest extends TestPase {
	private HomePage homePageobject;
	private UserLoginpage userLoginobject;
	private LogoutPage logoutObject;
	private MyaccountPage myaccountObject;
	private ChangePasswordPage changepasswordOject;
	
	// variables
	String MyaccountPageUrl = "https://demo.nopcommerce.com/customer/info";
	String MyChangePasswordPageUrl = "https://demo.nopcommerce.com/customer/changepassword";
	String ChangePassMessText = "Password was changed";

	// Tests
	// AssertOpenMyaccountPage
	@Test(priority = 0)
	public void AssertOpenMyaccountPage() {
		homePageobject = new HomePage(driver);
		myaccountObject = new MyaccountPage(driver);
		userLoginobject = new UserLoginpage(driver);
		logoutObject = new LogoutPage(driver);
		homePageobject.ClickLoginLink();
		userLoginobject.UserLogin("elkawy11@gmail.com", "test1234");
		homePageobject.ClickMyaccountLink();
		Assert.assertEquals(myaccountObject.GetMyAccountPageUrl(), MyaccountPageUrl);
		logoutObject.UserLogOut();
		
		
	}

	@Test(priority = 1)
	// Assert Open Change Password Page
	public void AssertOpenChangePasswordPage() {
		homePageobject = new HomePage(driver);
		myaccountObject = new MyaccountPage(driver);
		changepasswordOject = new ChangePasswordPage(driver);
		logoutObject = new LogoutPage(driver);
		userLoginobject = new UserLoginpage(driver);
		homePageobject.ClickLoginLink();
		userLoginobject.UserLogin("elkawy11@gmail.com", "test1234");
		homePageobject.ClickMyaccountLink();
		myaccountObject.ClickChangePassword();
		Assert.assertEquals(changepasswordOject.GetChangePassPageUrl(), MyChangePasswordPageUrl);
		logoutObject.UserLogOut();
	}

	@Test(priority = 2)
	// Assert Change Password Success
	public void AssertChangePasswordSuccess() {
		homePageobject = new HomePage(driver);
		myaccountObject = new MyaccountPage(driver);
		changepasswordOject = new ChangePasswordPage(driver);
		homePageobject = new HomePage(driver);
		userLoginobject = new UserLoginpage(driver);
		homePageobject.ClickLoginLink();
		userLoginobject.UserLogin("elkawy11@gmail.com", "test1234");
		homePageobject.ClickMyaccountLink();
		myaccountObject.ClickChangePassword();
		changepasswordOject.UserCanChangePassword("test1234", "test@1234", "test@1234");
		Assert.assertEquals(changepasswordOject.GetChangePassMessSuccess(), ChangePassMessText);
	}
}
