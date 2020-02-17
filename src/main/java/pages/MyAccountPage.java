package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	@FindBy (xpath  = "/html/body/div[6]/div[3]/div/div[1]/div/div[2]/ul/li[7]/a")
	WebElement changePassLink;
	@FindBy(id = "OldPassword")
	WebElement oldPassField;
	@FindBy(id = "NewPassword")
	WebElement newPassField;
	@FindBy(id = "ConfirmNewPassword")
	WebElement ConfNewPassField ;
	@FindBy(css = "input.button-1.change-password-button")
	WebElement changePassBtn ;
	@FindBy(css = "div.result")
	public WebElement passChangeConfirmation;
	
	
	public void changePass()
	{
		clickBtn(changePassLink);
	}
	public void enteringNewPass(String oldPass, String newPass)
	{
		setTextInField(oldPassField, oldPass);
		setTextInField(newPassField, newPass);
		setTextInField(ConfNewPassField, newPass);
		clickBtn(changePassBtn);
	}
	
		
		
	

}
