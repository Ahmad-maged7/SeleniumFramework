package tests;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;

public class ChangePassFromMyAccountTest extends TestBase {

	HomePage homeObject;
	LoginPage loginObject;
	MyAccountPage myaccountobject;
	
	@Test
	public void userCanRegister()
	{
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		homeObject = new HomePage(driver);
		homeObject.openLoginPage();
		loginObject = new LoginPage(driver);
		loginObject.userLogin("1abcdtest1212@test1212.com", "123456781");
		assertTrue(homeObject.MyAccountLink.isDisplayed());
	}
	@Test
	public void userChangePass()
	{
		homeObject.openMyacconutPage();
		myaccountobject = new MyAccountPage(driver);
		myaccountobject.changePass();
		myaccountobject.enteringNewPass("123456781", "123456782");
		assertTrue(myaccountobject.passChangeConfirmation.isDisplayed());
	}
}
