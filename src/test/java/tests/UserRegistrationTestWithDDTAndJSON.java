package tests;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import data.JsonDataReader;
import pages.HomePage;
import pages.LogoutPage;
import pages.UserRegistrationPage;

public class UserRegistrationTestWithDDTAndJSON extends TestPase {
	private String RegisterMessSuccessText = "Your registration completed";
	private HomePage homepageobject;
	private UserRegistrationPage Registobject;
	private LogoutPage LogutPageobject;
	

	@Test(priority = 0)
	public void AssertOpenReisterPagee() {
		homepageobject = new HomePage(driver);
		homepageobject.ClickRegisterLink();
		Registobject = new UserRegistrationPage(driver);
		Assert.assertTrue(Registobject.IsRegistrationBtnDisplay());
	}

	@Test(priority = 1)
	public void AssertUserCanRegisration() throws Exception, IOException {
		JsonDataReader jsonReader = new JsonDataReader();
		jsonReader.JsonReader();
		homepageobject = new HomePage(driver);
		homepageobject.ClickRegisterLink();;
		Registobject = new UserRegistrationPage(driver);
		LogutPageobject = new LogoutPage(driver);
		Registobject.userRegisration(jsonReader.Firstname,jsonReader.Lastname,jsonReader.Email,jsonReader.Password);
		Assert.assertEquals(Registobject.GetRgisterMessSuccess(), RegisterMessSuccessText);
		LogutPageobject.UserLogOut();
		}
	}

