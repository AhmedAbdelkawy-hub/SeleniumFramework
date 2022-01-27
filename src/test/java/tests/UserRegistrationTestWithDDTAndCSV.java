package tests;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import pages.HomePage;
import pages.LogoutPage;
import pages.UserRegistrationPage;

public class UserRegistrationTestWithDDTAndCSV extends TestPase {
	private String RegisterMessSuccessText = "Your registration completed";
	private HomePage homepageobject;
	private UserRegistrationPage Registobject;
	private LogoutPage LogutPageobject;
	CSVReader reader;

	@Test(priority = 0)
	public void AssertOpenReisterPagee() {
		homepageobject = new HomePage(driver);
		homepageobject.ClickRegisterLink();
		Registobject = new UserRegistrationPage(driver);
		Assert.assertTrue(Registobject.IsRegistrationBtnDisplay());
	}

	@Test(priority = 1)
	public void AssertUserCanRegisration() throws Exception, IOException {
		
		//Get Path Off CSV File
		String CSV_file = System.getProperty("user.dir")+"/src/test/java/data/DDTRegistercsv -.csv";
		reader = new CSVReader(new FileReader(CSV_file));
		
		// while loop to read the values from file 
		String [] csvCell;
		while ((csvCell = reader.readNext()) != null) 
		{
		String firstName = csvCell[0];
		String lastName  = csvCell[1];
		String email = csvCell[2];
		String Password = csvCell[3];
		
        //Test
		homepageobject = new HomePage(driver);
		homepageobject.ClickRegisterLink();;
		Registobject = new UserRegistrationPage(driver);
		LogutPageobject = new LogoutPage(driver);
		Registobject.userRegisration(firstName, lastName, email, Password);
		Assert.assertEquals(Registobject.GetRgisterMessSuccess(), RegisterMessSuccessText);
		LogutPageobject.UserLogOut();
		}
	}

}