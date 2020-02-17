package steps;

import static org.testng.Assert.assertTrue;

import com.github.javafaker.Faker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegisterPage;
import tests.TestBase;

public class UserRegistration extends TestBase{
	
	HomePage homeObject;
	RegisterPage registerObject;
	
	
	@Given("the user is in the homepage")
	public void the_user_is_in_the_homepage() {
	
	  
	}

	@When("click the register link")
	public void click_the_register_link() {
		homeObject = new HomePage(driver);
		homeObject.openRegisterPage();	
	}

	/*@When("enter all required fields")
	public void enter_all_required_fields() {
		Faker fakeData = new Faker();
		String fName = fakeData.name().firstName();
		String lName = fakeData.name().lastName();
		String Email = fakeData.internet().emailAddress();
		String Pass = fakeData.number().digits(8).concat(fName).toString();
	  registerObject = new RegisterPage(driver);
	  registerObject.registration(fName, lName, Email, Pass);
	}*/
	@When("the user enters {},{},{},{}")
	public void the_user_enters(String firstName, String lastName, String email, String pass) {
		 registerObject = new RegisterPage(driver);
		  registerObject.registration(firstName, lastName, email, pass);
	}

	@Then("user should register successfully")
	public void user_should_register_successfully() {
		assertTrue(homeObject.MyAccountLink.isDisplayed());
		registerObject.userLogout();
	   
	}

}
