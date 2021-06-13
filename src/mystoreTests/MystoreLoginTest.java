package mystoreTests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MystoreLoginTest extends MystoreBaseTests {
	
	
	
	@BeforeMethod
	public void preSvakogTesta() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
	}
	
	
	
	@Test(priority = 0)
	public void signInValidCredentials() throws InterruptedException {
		
	
		String username = citacIzExcela.getStringData("LoginTests", 6, 2);
		String password = String.valueOf(citacIzExcela.getIntegerData("LoginTests", 7, 2));
		String textForAssertion = citacIzExcela.getStringData("LoginTests", 12, 2);
		logInFormFilling(username, password);
		
		
		
		String actualText = myStoreAccountPage.textFromSignOutButton();
		assertEquals(actualText, textForAssertion);
	}
	
	
	
	
	@Test(priority = 5)
	public void signInWrongEmail() throws InterruptedException {
		
		String username = citacIzExcela.getStringData("LoginTests", 6, 3);
		String password = String.valueOf(citacIzExcela.getIntegerData("LoginTests", 7, 3));
		String textForAssertion = citacIzExcela.getStringData("LoginTests", 12, 3);
		
		logInFormFilling(username, password);
		
		String actualText =   myStoreLoginPage.textFromErrorMessageUsername();
		assertEquals(actualText, textForAssertion);
	}
	
	
	
	@Test(priority = 10)
	public void signInWrongPassword() throws InterruptedException {
		
		String username = citacIzExcela.getStringData("LoginTests", 6, 4);
		String password = citacIzExcela.getStringData("LoginTests", 7, 4);
		String textForAssertion = citacIzExcela.getStringData("LoginTests", 12, 4);
		
		logInFormFilling(username, password);
		
		String actualText = myStoreLoginPage.textFromErrorMessagePassword();
		assertEquals(actualText, textForAssertion);
	}
	
	
	
	
	@Test(priority = 15)
	public void signInEmptyCredentials() throws InterruptedException {
		
		String username = citacIzExcela.getStringData("LoginTests", 6, 5);
		String password = citacIzExcela.getStringData("LoginTests", 7, 5);
		String textForAssertion = citacIzExcela.getStringData("LoginTests", 12, 5);
		
		logInFormFilling(username, password);
		
		String actualText = myStoreLoginPage.textFromErrorMessageEmpty();
		assertEquals(actualText, textForAssertion);
	}
	
	
	
	
	@Test(priority = 20)
	public void logOut() throws InterruptedException {
		
		signInValidCredentials(); 
		myStoreAccountPage.ClickSignOutButton();
		String textForAssertion = citacIzExcela.getStringData("LogoutTest", 11, 2);
		
		String actualText = myStoreAccountPage.textFromSignInButton();
		assertEquals(actualText, textForAssertion);
		
		//Assert.assertEquals(true, myStoreAccountPage.getSignInButton().isDisplayed());
	}
	
	
	
	
	public void logInFormFilling(String username, String password) {
		myStoreMainPage.ClickSignInTab();
		myStoreLoginPage.insertUsername(username);
		myStoreLoginPage.insertPassword(password);
		myStoreLoginPage.ClickSignInButton();
	}
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void posleSvakogTesta() throws InterruptedException {		
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
	

	
	
	
}
