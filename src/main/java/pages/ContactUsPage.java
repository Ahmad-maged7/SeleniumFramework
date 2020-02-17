package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageBase {

	public ContactUsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "FullName")
	WebElement nameField;
	@FindBy(id = "Email")
	WebElement emailField ;
	@FindBy(id = "Enquiry")
	WebElement msgField ;
	@FindBy(css = "input.button-1.contact-us-button")
	WebElement contactUsSubmitBtn ;
	@FindBy(css = "div.result")
	public WebElement confirmContactMsg ;
	
	public void userCanSubmitContactUsForm(String name, String mail, String msg)
	{
		setTextInField(nameField, name);
		setTextInField(emailField, mail);
		setTextInField(msgField, msg);
		clickBtn(contactUsSubmitBtn);
	}
}
