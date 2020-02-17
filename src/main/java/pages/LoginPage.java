package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy (id = "Email")
	WebElement emailTxtF;
	@FindBy(id = "Password")
	WebElement passwordTxtF;
	@FindBy(css = "input.button-1.login-button")
	WebElement loginBtn;
	
	public void userLogin(String email, String pass)
	{
		setTextInField(emailTxtF, email);
		setTextInField(passwordTxtF, pass);
		clickBtn(loginBtn);
		
	}

}
