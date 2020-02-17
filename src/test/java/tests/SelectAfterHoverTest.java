package tests;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.PLPage;

public class SelectAfterHoverTest extends TestBase {

	HomePage homeObject;
	PLPage PLPageObject ;
	
	
	@Test
	public void userCanHoverAndSelect()
	{
		homeObject = new HomePage(driver);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		homeObject.hoverAndSelect();
		PLPageObject = new PLPage(driver);
		assertTrue(PLPageObject.PLPTitle.getText().contains("Desktops"));
		
	}
}
