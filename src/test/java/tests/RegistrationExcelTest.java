package tests;


import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class RegistrationExcelTest extends TestBase
{
	HomePage homeObject;
	RegisterPage registerObject;
	LoginPage loginObject;
	
	@DataProvider(name="ExcelData")
	public Object [][] userRegisterData() throws IOException
	{
		ExcelReader Ereader = new ExcelReader();
		return Ereader.getExcelData();
	}
	
		
	

	@Test(priority = 1, alwaysRun = true,dataProvider = "ExcelData")
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
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		loginObject.userLogin(Email, Pass);
		assertTrue(homeObject.MyAccountLink.isDisplayed());
		registerObject.userLogout();
		
	}
	
}




