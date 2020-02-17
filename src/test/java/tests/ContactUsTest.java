package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsTest extends TestBase{

	HomePage homeObject;
	ContactUsPage contactUsObject;

	String name ="ahmad";
	String mail = "test@test.comm";
	String msg = "abcdefg";
	
	@Test
	public void userCanSendContactUs()
	{
		homeObject = new HomePage(driver);
		homeObject.scrollToBottom();
		homeObject.goToContactUsPage();
		contactUsObject = new ContactUsPage(driver);
		contactUsObject.userCanSubmitContactUsForm(name, mail, msg);
		assertTrue(contactUsObject.confirmContactMsg.isDisplayed());
		
	}
}
