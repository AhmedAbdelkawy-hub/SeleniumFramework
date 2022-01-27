package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LogoutPage;
import pages.UserLoginpage;
import pages.UserRegistrationPage;

public class UserLoginTest extends TestPase {
	private HomePage homePageobject;
	private UserLoginpage userLoginobject;
	private LogoutPage logoutobject;
	
	// Tests
	@Test (priority = 0)
	public void OpenLoginPage() {
		homePageobject = new HomePage(driver);
		homePageobject.ClickLoginLink();
		userLoginobject = new UserLoginpage(driver);
		Assert.assertTrue(userLoginobject.IsLoginBtnDisplay());
		
	}
	@Test(priority = 1)
	public void  AssertUserCanLogin() {
		homePageobject = new HomePage(driver);
		homePageobject.ClickLoginLink();
		userLoginobject = new UserLoginpage(driver);
		logoutobject = new LogoutPage(driver);
		userLoginobject.UserLogin("elkawy11@gmail.com", "test1234");
		Assert.assertTrue(logoutobject.IslogoutBtnIsDisplay());
		
	}

}
