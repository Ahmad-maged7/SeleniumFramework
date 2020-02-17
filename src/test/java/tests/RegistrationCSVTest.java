package tests;


import static org.testng.Assert.assertTrue;

import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class RegistrationCSVTest extends TestBase
{
	HomePage homeObject;
	RegisterPage registerObject;
	LoginPage loginObject;
	CSVReader reader ;
	
	
		
	

	@Test(priority = 1, alwaysRun = true)
	public void userCanRegister() throws CsvValidationException, IOException
	{
		String CSV_File = System.getProperty("user.dir")+"/src/test/java/data/userData.csv";
		reader = new CSVReader(new FileReader(CSV_File));
		
		String [] csvCell ;
		while ((csvCell = reader.readNext()) != null) {
			
			String fname = csvCell[0];
			String lname = csvCell[1];
			String email =csvCell[2];
			String pass = csvCell[3];
		
		homeObject = new HomePage(driver);
		homeObject.openRegisterPage();
		registerObject = new RegisterPage(driver);
		registerObject.registration(fname, lname, email, pass);
		assertTrue(registerObject.successMsg.getText().contains("registration"));
		registerObject.userLogout();
		
		homeObject.openLoginPage();
		loginObject = new LoginPage(driver);
		loginObject.userLogin(email, pass);
		assertTrue(homeObject.MyAccountLink.isDisplayed());
		registerObject.userLogout();
	
	}
	}
	
}




