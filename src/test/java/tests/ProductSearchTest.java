package tests;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.PDPage;
import pages.SearchResultsPage;

public class ProductSearchTest extends TestBase{

	HomePage homeObject;
	SearchResultsPage searchReslutsObject;
	PDPage PDPobject ;
	
	String productName= "Apple MacBook Pro 13-inch";
	@Test
	public void userCanReachProductBySearch()
	{
		homeObject= new HomePage(driver);
		homeObject.gotoSearchPage(productName);
		searchReslutsObject = new SearchResultsPage(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		searchReslutsObject.gotoTargetProduct();
		PDPobject = new PDPage(driver);
		assertTrue(PDPobject.searchedProduct.isDisplayed());
	}
	

}
