package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class PageBase 
{
	protected WebDriver driver;
	public JavascriptExecutor jse ;
	public Select select ;
	public Actions action ;

	public PageBase (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	protected static void clickBtn (WebElement button)
	{
		//button.sendKeys(Keys.ENTER);
		button.click();
	}
	protected static void setTextInField (WebElement txtEntery,String value)
	{
		txtEntery.sendKeys(value);
	}
	public void scrollToBottom()
	{
		jse.executeScript("scrollBy(0,3000)");
	}
	public void scrollToProducts()
	{
		jse.executeScript("scrollBy(0,1450)");
	}
	public void clearQtyField(WebElement element)
	{
		element.sendKeys(Keys.BACK_SPACE);
	}
	
}
