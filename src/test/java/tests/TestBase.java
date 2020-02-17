package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utilities.Helper;

public class TestBase
extends AbstractTestNGCucumberTests
{
	public static WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	public void startDriver(@Optional ("chrome") String browserName)
	{
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"/drivers/chromedriver");
			driver = new ChromeDriver(); }
			else if (browserName.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			}
			else if (browserName.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"/drivers/msedgedriver");
				 driver = new EdgeDriver();
			}
		else if (browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		else if (browserName.equalsIgnoreCase("headless"))
		{
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setJavascriptEnabled(true);
			caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, 
					System.getProperty("user.dir")+"/drivers/phantomjs");
			String[] phantomJsArgs = {"--web-security=no","--ignore-ssl-errors=yes"};
			caps.setCapability(PhantomJSDriverService.PHANTOMJS_GHOSTDRIVER_CLI_ARGS, phantomJsArgs);
			driver = new PhantomJSDriver(caps);
		}
		
		
	    //driver = new ChromeDriver(); 
	    driver.manage().window().maximize();
		driver.navigate().to("https://demo.nopcommerce.com");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	}
	@AfterClass
	public void stopDriver() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.quit();
	}
	@AfterMethod
	public void ScreenShotForFailure(ITestResult result)
	{
		if (result.getStatus()== ITestResult.FAILURE) {
			System.out.println("Failed!,,,, Taking ScreenShoot");
			Helper.takeScreenShot(driver, result.getName());
		}
	}
}
