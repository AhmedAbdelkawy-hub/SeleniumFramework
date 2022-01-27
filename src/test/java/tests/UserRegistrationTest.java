package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.UserRegistrationPage;

public class UserRegistrationTest extends TestPase {
	private String RegisterMessSuccessText = "Your registration completed";
	private HomePage homepageobject;
	private UserRegistrationPage Registobject;

	@Test(priority = 0)
	public void AssertOpenReisterPagee() {
		homepageobject = new HomePage(driver);
		homepageobject.ClickRegisterLink();
		Registobject = new UserRegistrationPage(driver);
		Assert.assertTrue(Registobject.IsRegistrationBtnDisplay());
	}

	@Test(priority = 1)
	public void AssertUserCanRegisration() {
		homepageobject = new HomePage(driver);
		homepageobject.ClickRegisterLink();;
		Registobject = new UserRegistrationPage(driver);
		Registobject.userRegisration("Ahmed", "mahmoud", "elkawy1@gmail.com", "test1234");
		Assert.assertEquals(Registobject.GetRgisterMessSuccess(), RegisterMessSuccessText);
	}

}