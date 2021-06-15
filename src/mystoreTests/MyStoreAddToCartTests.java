package mystoreTests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyStoreAddToCartTests extends MystoreBaseTests {


	@BeforeMethod
	public void preSvakogTesta() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
	}
	
	
	
	
	
	@Test(priority = 0)
	public void addingOneItemToCart() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions hover = new Actions(driver);
		
		
		String username = citacIzExcela.getStringData("LoginTests", 6, 2);
		String password = String.valueOf(citacIzExcela.getIntegerData("LoginTests", 7, 2));
		logInFormFilling(username, password);
		
		
		myStoreAccountPage.clickOnHomeButton();
		js.executeScript("window.scrollBy(0, 500)");
		hover.moveToElement(myStoreMainPage.getFadedTshirtPicture()).perform();
		myStoreMainPage.clickOnAddToCartButton();
		
		myStoreMainPage.getProceedToCheckoutButton().click();
		
		
		Assert.assertEquals(myStoreShoppingCartSummaryPage.getNumberOfProductsInCart().getText(), citacIzExcela.getStringData("AddingProductsCartTests", 12, 2));
	}
	
	
	
	
	
	
	@Test(priority = 5)
	public void addingOneItemToCartWithQuantityIncreasing() throws InterruptedException {
		
		addingOneItemToCart();
		for (int i = 1; i < 3; i++) {
			myStoreShoppingCartSummaryPage.clickPlusButton();
		}
	//	Thread.sleep(3000);
		Assert.assertEquals(myStoreShoppingCartSummaryPage.getNumberOfProductsInCart().getText(), citacIzExcela.getStringData("AddingProductsCartTests", 21, 2));
		
	}
	
	
	
	
	@Test(priority = 10)
	public void deletingProductFromCart() throws InterruptedException {
	
		addingOneItemToCart();
		myStoreShoppingCartSummaryPage.clickDeleteFromCartIcon();
		Thread.sleep(3000);
		Assert.assertEquals(myStoreShoppingCartSummaryPage.getCartEmptyLabel().getText(), citacIzExcela.getStringData("AddingProductsCartTests", 34, 2));
		
	}
	

	
	
	
	@AfterMethod
	public void posleSvakogTesta() throws InterruptedException {		
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
	
	
	public void logInFormFilling(String username, String password) {
		myStoreMainPage.ClickSignInTab();
		myStoreLoginPage.insertUsername(username);
		myStoreLoginPage.insertPassword(password);
		myStoreLoginPage.ClickSignInButton();
		myStoreAccountPage.ClickCustomerNameButton();
	}
	
	
	

	
}
