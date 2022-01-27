package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LogoutPage;
import pages.UserLoginpage;

public class UserLogOutTest extends TestPase {
	
	
	private HomePage homePageobject;
	private UserLoginpage userLoginobject;
	private LogoutPage logoutobject;
	
	// Tests 
	@Test
	public void AssetrUserCanLogout() {
		homePageobject = new HomePage(driver);
		userLoginobject = new UserLoginpage(driver);
		logoutobject = new LogoutPage(driver);
		homePageobject.ClickLoginLink();
		userLoginobject.UserLogin("elkawy11@gmail.com", "test1234");
		logoutobject.UserLogOut();
		Assert.assertTrue(homePageobject.IsLoginLinkIsDisplay());
	}

}
