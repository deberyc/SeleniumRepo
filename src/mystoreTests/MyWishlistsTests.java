package mystoreTests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyWishlistsTests extends MystoreBaseTests {
	
	
	@BeforeMethod
	public void preSvakogTesta() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
	}
	
	
	
	
	@Test(priority = 0)
	public void addingWishList() throws InterruptedException {
	
		String username = citacIzExcela.getStringData("LoginTests", 6, 2);
		String password = String.valueOf(citacIzExcela.getIntegerData("LoginTests", 7, 2));
		logInFormFilling(username, password);
		
		
		String listName = citacIzExcela.getStringData("WishListTests", 6, 2);
		wishlistFilling (listName);
		
		String textForAssertion = citacIzExcela.getStringData("WishListTests", 10, 2);
		
		String actualText = myWishlistsPage.textAfterCreatedList();
		assertEquals(actualText, textForAssertion);
		
	}
	
	
	
	@Test(priority = 10)
	public void removingWishList() throws InterruptedException {
		 addingWishList();
		 myWishlistsPage.ClickDeleteSign();
		 driver.switchTo().alert().accept();
		 
		 String textForAssertion = citacIzExcela.getStringData("WishListTests", 10, 2);
			
			String actualText = myWishlistsPage.textAfterCreatedList();
			assertEquals(actualText, textForAssertion);
		
	}
	
	
	@Test(priority = 15)
	public void multipleWishList() throws InterruptedException {
		 addingWishList();
		 
		 String listName2 = citacIzExcela.getStringData("WishListTests", 18, 2);
		 String listName3 = citacIzExcela.getStringData("WishListTests", 20, 2);
		 severalWishlists (listName2, listName3);
		
		 String textForAssertion = citacIzExcela.getStringData("WishListTests", 24, 2);
			
			String actualText = myWishlistsPage.textAfterCreatedList();
			assertEquals(actualText, textForAssertion);
		
	}
	
	
	public void logInFormFilling(String username, String password) {
		myStoreMainPage.ClickSignInTab();
		myStoreLoginPage.insertUsername(username);
		myStoreLoginPage.insertPassword(password);
		myStoreLoginPage.ClickSignInButton();
		myStoreAccountPage.ClickCustomerNameButton();
	}
	
	
	
	public void wishlistFilling (String listName) {

		myStoreAccountPage.ClickMyWishlistsTab();
		myWishlistsPage.insertWishlistName(listName);
		myWishlistsPage.ClickSaveListField();
		myWishlistsPage.insertWishlistName(listName);
		myWishlistsPage.ClickSaveListField();
		
	}
	
	

	public void severalWishlists (String listName2, String listName3) {

	//	myStoreAccountPage.ClickMyWishlistsTab();
		myWishlistsPage.insertWishlistName2(listName2);
		myWishlistsPage.ClickSaveListField();
		myWishlistsPage.insertWishlistName3(listName3);
		myWishlistsPage.ClickSaveListField();
	}
	
	
	
	
	
	@AfterMethod
	public void posleSvakogTesta() throws InterruptedException {		
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
	

}
