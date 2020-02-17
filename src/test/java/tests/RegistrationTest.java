package tests;


import static org.testng.Assert.assertTrue;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class RegistrationTest extends TestBase
{
	HomePage homeObject;
	RegisterPage registerObject;
	LoginPage loginObject;
	
	@DataProvider(name = "userRegistrationData")
	public static Object [][] userRegistrationData() 
	{
		return new Object [][]{
		{"121aahmad1","maged","12a11testzxc@ttest.com","1234567"},
		{"1tester","test","2123testxxx@test.net","12345678"}
		};
	}
		
	

	@Test(priority = 1, alwaysRun = true,dataProvider = "userRegistrationData")
	public void userCanRegister(String Fname, String Lname, String Email, String Pass)
	{
		homeObject = new HomePage(driver);
		homeObject.openRegisterPage();
		registerObject = new RegisterPage(driver);
		registerObject.registration(Fname, Lname, Email, Pass);
		assertTrue(registerObject.successMsg.getText().contains("registration"));
		registerObject.userLogout();
		
		registerObject.openLoginPage();
		loginObject = new LoginPage(driver);
		loginObject.userLogin(Email, Pass);
		assertTrue(homeObject.MyAccountLink.isDisplayed());
		registerObject.userLogout();
		
	}
	
}




