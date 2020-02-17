package tests;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.PDPage;

public class SearchUsingAutoCompleteTest extends TestBase {

	HomePage homeObject;
	PDPage PDPobject ;
	
	String partialProductName = "mac";
	
	@Test
	public void userCanReachItemBySuggestedSearch()
	{
		homeObject= new HomePage(driver);
		homeObject.typeToOpenSuggestedList(partialProductName);
		PDPobject= new PDPage(driver);
		assertTrue(PDPobject.searchedProduct.isDisplayed());
		
	}
	
}
