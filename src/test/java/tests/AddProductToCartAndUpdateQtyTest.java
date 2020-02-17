package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.CartPage;
import pages.HomePage;
import pages.PDPage;

public class AddProductToCartAndUpdateQtyTest  extends TestBase{

	HomePage homeObject;
	PDPage PDPageObject;
	CartPage CartObject;


	String partialProductName = "mac";
	String Qty="4";
	

	@Test(priority = 1)
	public void userCanReachItemBySuggestedSearch()
	{
		homeObject= new HomePage(driver);
		homeObject.typeToOpenSuggestedList(partialProductName);
		PDPageObject= new PDPage(driver);
		assertTrue(PDPageObject.searchedProduct.isDisplayed());

	}
	@Test(priority = 2,dependsOnMethods = "userCanReachItemBySuggestedSearch")
	public void UserCanAddItemToCart() throws InterruptedException
	{
		PDPageObject.addProductToCart();
		
		PDPageObject.goToCartPage();
	}
	
	@Test(dependsOnMethods = "UserCanAddItemToCart")
	public void UserCanUpdateQtyFromCart() throws InterruptedException
	{

		CartObject = new CartPage(driver);
		CartObject.UpdateQty(Qty);
	}



}
