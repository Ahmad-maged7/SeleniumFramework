package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class PDPage extends PageBase{

	public PDPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "main-product-img-4")
	public WebElement searchedProduct;
	@FindBy(id = "add-to-cart-button-4")
	public WebElement addToCartBtn ;
	@FindBy(css = "span.cart-label")
	public WebElement cartIcon ;
	@FindBy(css = "span.price-value-4")
	public WebElement productPrice ;
	@FindBy(css = "input.button-1.cart-button")
	WebElement goToCartBtn;
	@FindBy(css= "span.close")
	WebElement closeGreenOverlay ;
	
	public void addProductToCart()
	{
		clickBtn(addToCartBtn);
	}

	public void goToCartPage()
	{
		clickBtn(closeGreenOverlay);
		Actions action = new Actions(driver);
		action.moveToElement(cartIcon).perform();
		clickBtn(goToCartBtn);
	}
	
}
