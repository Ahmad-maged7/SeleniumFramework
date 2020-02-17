package tests;


import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import org.testng.annotations.Test;

import data.JsonReader;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class RegistrationJsonTest extends TestBase
{
	HomePage homeObject;
	RegisterPage registerObject;
	LoginPage loginObject;
	
	
		
	

	@Test(priority = 1, alwaysRun = true)
	public void userCanRegister() throws FileNotFoundException, IOException, ParseException
	{
	JsonReader jsonReader = new JsonReader();
		jsonReader.jReader();
		
		
		homeObject = new HomePage(driver);
		homeObject.openRegisterPage();
		registerObject = new RegisterPage(driver);
		registerObject.registration(jsonReader.firstname,jsonReader.lastname , jsonReader.email,jsonReader.password );
		assertTrue(registerObject.successMsg.getText().contains("registration"));
		registerObject.userLogout();
		
		registerObject.openLoginPage();
		loginObject = new LoginPage(driver);
		loginObject.userLogin(jsonReader.email, jsonReader.password);
		assertTrue(homeObject.MyAccountLink.isDisplayed());
		registerObject.userLogout();
		
	}
	
}




