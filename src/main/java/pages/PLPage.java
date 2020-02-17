package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PLPage extends PageBase {

	public PLPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(css = "div.page-title")
	public WebElement PLPTitle ;
}
