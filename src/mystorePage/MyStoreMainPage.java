package mystorePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyStoreMainPage {
	
	WebDriver driver;
	WebElement signInTab;
	
	WebElement fadedTshirtPicture;
	WebElement addToCartButton;
	WebElement proceedToCheckoutButton;
	WebElement shoppingCartButton;
	WebElement oneProductInCartLabel;
	
	WebElement closePopupWindow;
	
	
	public MyStoreMainPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

//...............................................................
	
	public WebElement getSignInTab() {
		return driver.findElement(By.className("login"));
	}
	
	
	
	public WebElement getFadedTshirtPicture () {
		return driver.findElement(By.xpath("//ul[@id='homefeatured']/li[2]/div/div/div"));
	}

	
	public WebElement getAddToCartButton() {
		return driver.findElement(By.xpath("//ul[@id='homefeatured']/li[2]/div/div/div[2]/a"));
	}

	
	public WebElement getProceedToCheckoutButton() {
		return driver.findElement(By.xpath("//div[@class='button-container']/a"));
	}

	
	public WebElement getShoppingCartButton() {
		return driver.findElement(By.className("shopping_cart"));
	}

	
	public WebElement getOneProductInCartLabel () {
		return driver.findElement(By.xpath("//div[@class='clearfix']/div[2]/span[2]"));
	}

	public WebElement getClosePopupWindow() {
		return driver.findElement(By.className("cross"));
	}

	
	//..................................................		
	
	public void ClickSignInTab() {
		
		this.getSignInTab().click();
	}
	
	
	public void clickOnFadedTshirtPicture () {
		getFadedTshirtPicture ().click();
	}

	
	public void clickOnAddToCartButton() {
		getAddToCartButton().click();
	}

	
	public void clickOnProceedToCheckoutButton() {
		getProceedToCheckoutButton().click();
	}

	
	public void clickShoppingCartButton() {
		getShoppingCartButton().click();
	}

	
	public void clickOnClosePopupWindow() {
		getClosePopupWindow().click();
	}

	

}
