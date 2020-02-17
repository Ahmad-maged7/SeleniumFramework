package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends PageBase
{

	public RegisterPage(WebDriver driver) 
	{
		super(driver);
	}
	@FindBy(id = "gender-male")
	WebElement genderMale;
	@FindBy(id = "FirstName")
	WebElement firstNameF;
	@FindBy(id = "LastName")
	WebElement lastNameF;
	@FindBy(id = "Email")
	WebElement emailTxt;
	@FindBy(id = "Password")
	WebElement passwordTxt;
	@FindBy(id = "ConfirmPassword")
	WebElement confirmPass;
	@FindBy(id = "register-button")
	WebElement registerBtn;
	@FindBy(css = "div.result")
	public WebElement successMsg; 
	@FindBy (css = "a.ico-logout")
	public WebElement logoutLink;
	@FindBy(css = "a.ico-login")
	public WebElement loginLink;
	
	public void registration(String firstName,String lastName, String email, String password)
	
	{
		clickBtn(genderMale);
		setTextInField(firstNameF, firstName);
		setTextInField(lastNameF, lastName);
		setTextInField(emailTxt, email);
		setTextInField(passwordTxt, password);
		setTextInField(confirmPass, password);
		clickBtn(registerBtn);
	}
	public void userLogout()
	{
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		clickBtn(logoutLink);
	}

	public void openLoginPage() 
	{
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	clickBtn(loginLink);	
	}
}