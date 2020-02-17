package tests;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.HomePage;

public class ChangeCurrencyTest extends TestBase {

	HomePage homeObject;
	
	@Test
	public void userCanCHangeCurrency()
	{
		homeObject = new HomePage(driver);
		homeObject.chooseAnotherCurrenct();
		homeObject.scrollToProducts();
		assertTrue(homeObject.productPriceCurrency.getText().contains("Ђ"));
		
	}
}
