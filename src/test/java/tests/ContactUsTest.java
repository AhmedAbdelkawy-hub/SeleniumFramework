package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsTest extends TestPase {

	private HomePage HomePageobject;
	private ContactUsPage ContuctUsPageobject;
	// variable
	private String name = "Ahmed";
	private String email = "Ahmed@gmail.com";
	private String enquiry = "test";
	private String SuccessMessageEnquiry = "Your enquiry has been successfully sent to the store owner";
	
	@Test
	public void usercanSentInfoFromContactUsPage() {
		HomePageobject = new HomePage(driver);
		ContuctUsPageobject = new ContactUsPage(driver);
		HomePageobject.ScrollDownHomPage();
		HomePageobject.OpenContactUsPage();
		ContuctUsPageobject.SubmitEnquiry(name, email, enquiry);
		Assert.assertTrue(ContuctUsPageobject.SucessMessageEnquiry().contains(SuccessMessageEnquiry));
	}
	
}
