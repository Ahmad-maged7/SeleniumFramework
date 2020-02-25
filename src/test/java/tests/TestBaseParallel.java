package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

//import io.cucumber.testng.AbstractTestNGCucumberTests;
import utilities.Helper;

public class TestBaseParallel
//extends AbstractTestNGCucumberTests
{


	protected ThreadLocal<RemoteWebDriver> driver = null ;


	@BeforeClass
	@Parameters(value={"browser"})
	public void startSession(@Optional ("chrome") String browser) throws MalformedURLException
	{
		driver = new ThreadLocal<RemoteWebDriver>();
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browserName", browser);

		driver.set(new RemoteWebDriver(new URL("http://localhost:2222/wd/hub"), caps));
		
		getDriver().manage().window().maximize();
		getDriver().navigate().to("https://demo.nopcommerce.com");
		getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
		public WebDriver getDriver()
		{
			return driver.get();
		}

	
	@AfterClass
	public void stopDriver() throws InterruptedException 
	{
		Thread.sleep(500);
		driver.get().quit();
		driver.remove();
	}
	@AfterMethod
	public void ScreenShotForFailure(ITestResult result)
	{
		if (result.getStatus()== ITestResult.FAILURE) {
			System.out.println("Failed!,,,, Taking ScreenShoot");
			Helper.takeScreenShot(driver.get(), result.getName());
		}
	}
}
