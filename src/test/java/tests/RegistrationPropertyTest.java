package tests;


import static org.testng.Assert.assertTrue;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.LoadProperties;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class RegistrationPropertyTest extends TestBase
{
	HomePage homeObject;
	RegisterPage registerObject;
	LoginPage loginObject;
	
	String FName = LoadProperties.userData.getProperty("firstName");
	String LName = LoadProperties.userData.getProperty("lastName");
	String Email = LoadProperties.userData.getProperty("email");
	String Pass = LoadProperties.userData.getProperty("pass");



	
		
	

	@Test(priority = 1, alwaysRun = true)
	public void userCanRegister()
	{
		homeObject = new HomePage(driver);
		homeObject.openRegisterPage();
		registerObject = new RegisterPage(driver);
		registerObject.registration(FName, LName, Email, Pass);
		assertTrue(registerObject.successMsg.getText().contains("registration"));
		registerObject.userLogout();
		
		registerObject.openLoginPage();
		loginObject = new LoginPage(driver);
		loginObject.userLogin(Email, Pass);
		assertTrue(homeObject.MyAccountLink.isDisplayed());
		registerObject.userLogout();
		
	}
	
}




