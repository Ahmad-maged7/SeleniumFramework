package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase
{


	public HomePage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
		 action = new Actions(driver);
	}
	@FindBy(css = "a.ico-register")
	WebElement registerLink;
	@FindBy(css = "a.ico-login")
	public WebElement loginLink;
	@FindBy(linkText = "My account")
	public WebElement MyAccountLink;
	@FindBy(id = "small-searchterms")
	public WebElement searchField;
	@FindBy(css = "input.button-1.search-box-button")
	public WebElement searchBtn ;
	@FindBy(id = "ui-id-1")
	List<WebElement> suggestedList;
	@FindBy(partialLinkText = "Contact us")
	WebElement contactUsLink;
	@FindBy(id = "customerCurrency")
	WebElement currencyList ;
	@FindBy(css= "span.price.actual-price")
	public WebElement productPriceCurrency ;
	@FindBy (xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/a")
	WebElement compMainMenuOption ;
	@FindBy (xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[1]/a")
	WebElement DesktopDropMenuOption;
	
	
	
	public void openRegisterPage()
	{
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		clickBtn(registerLink);
	}
	public void openLoginPage() 
	{
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	clickBtn(loginLink);	
	}
	public void openMyacconutPage()
	{
		clickBtn(MyAccountLink);
	}
	public void gotoSearchPage(String productName)
	{
		setTextInField(searchField, productName);
		clickBtn(searchBtn);
	}
	public void typeToOpenSuggestedList(String partialProductName )
	{
		setTextInField(searchField, partialProductName);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		suggestedList.get(0).click();
	}
	public void goToContactUsPage()
	{
		clickBtn(contactUsLink);
	}
	public void chooseAnotherCurrenct()
	{
		select = new Select(currencyList);
		select.selectByIndex(1);
	}
	public void hoverAndSelect()
	{
		action.moveToElement(compMainMenuOption).moveToElement(DesktopDropMenuOption).click().perform();

	}

}
