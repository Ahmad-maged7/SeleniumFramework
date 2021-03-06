package tests;


import static org.testng.Assert.assertTrue;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class RegistrationFakeDataTest extends TestBase
{
	HomePage homeObject;
	RegisterPage registerObject;
	LoginPage loginObject;

	Faker fakeData = new Faker();
	String fName = fakeData.name().firstName();
	String lName = fakeData.name().lastName();
	String Email = fakeData.internet().emailAddress();
	String Pass = fakeData.number().digits(8).concat(fName).toString();



	@Test(priority = 1, alwaysRun = true)
	public void userCanRegister()
	{
		homeObject = new HomePage(driver);
		homeObject.openRegisterPage();
		registerObject = new RegisterPage(driver);
		registerObject.registration(fName, lName, Email, Pass);
		System.out.println("the user data is "+" "+fName+" "+lName+" "+Email+" "+Pass);
		assertTrue(registerObject.successMsg.getText().contains("registration"));
		registerObject.userLogout();

		registerObject.openLoginPage();
		loginObject = new LoginPage(driver);
		loginObject.userLogin(Email, Pass);
		assertTrue(homeObject.MyAccountLink.isDisplayed());
		registerObject.userLogout();

	}

}




