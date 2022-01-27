package steps;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import data.JsonDataReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LogoutPage;
import pages.UserRegistrationPage;
import runner.TestRunner;
import tests.TestPase;


public class UserRegisteration extends TestPase {
	
	String RegisterMessSuccessText = "Your registration completed";
	HomePage homepageobject;
	UserRegistrationPage Registobject;
	LogoutPage LogutPageobject;


	@Given("User open Registeration Page")
	public void user_open_registeration_page() {
		homepageobject = new HomePage(driver);
		homepageobject.ClickRegisterLink();
	}

	@When("User Enter all registeration data")
	public void user_enter_all_registeration_data() throws JsonIOException, JsonSyntaxException, IOException, ParseException {
		JsonDataReader jsonReader = new JsonDataReader();
		jsonReader.JsonReader();
		Registobject = new UserRegistrationPage(driver);

		Registobject.userRegisration(jsonReader.Firstname, jsonReader.Lastname, jsonReader.Email, jsonReader.Password);
	}

	@When("User Click Submit Data")
	public void the_user_enter_all_registeration_data() {

	}

	@Then("User regisered sucess and Message appeared")
	public void the_registeration_page_opend_success() {

		Assert.assertEquals(Registobject.GetRgisterMessSuccess(), RegisterMessSuccessText);
	}
}
