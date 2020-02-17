package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends PageBase {

	public CartPage(WebDriver driver) {
		super(driver);

	
	}
	@FindBy(css = "span.product-unit-price")
	public WebElement productPriceInCart ;
	@FindBy (css = "input.qty-input")
	public WebElement QtyFlield ;
	@FindBy(css = "span.product-subtotal")
	WebElement ProductTotalPrice ;
	@FindBy(css = "input.button-2.update-cart-button")
	public WebElement updateCartBtn;
	
	
	
	public void UpdateQty(String Qty) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 4);
		wait.until(ExpectedConditions.attributeContains(QtyFlield, "value", "2"));
		clearQtyField(QtyFlield);

		
		setTextInField(QtyFlield, Qty );
		
		wait.until(ExpectedConditions.attributeContains(QtyFlield, "value", Qty));
		clickBtn(updateCartBtn);
		
	}

}
