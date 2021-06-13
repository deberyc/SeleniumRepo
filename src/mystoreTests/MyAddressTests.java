package mystoreTests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class MyAddressTests extends MystoreBaseTests{

	
	@BeforeMethod
	public void preSvakogTesta() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
	}
	
	
	
	@Test(priority = 0)
	public void selectingMyAccountSection() throws InterruptedException {
		
	
		String username = citacIzExcela.getStringData("AccountSection", 7, 2);
		String password = String.valueOf(citacIzExcela.getIntegerData("AccountSection", 8, 2));
		String textForAssertion = citacIzExcela.getStringData("AccountSection", 13, 2);
		logInFormFilling(username, password);
		
		
		
		
		String actualText = myStoreAccountPage.textFromCustomerButton();
		assertEquals(actualText, textForAssertion);
	}
	
	
	
	
	@Test(priority = 5)
	public void updatingAddress() throws InterruptedException {
		
	
		String username = citacIzExcela.getStringData("LoginTests", 6, 2);
		String password = String.valueOf(citacIzExcela.getIntegerData("LoginTests", 7, 2));
		logInFormFilling(username, password);
		
		
		
		String address = citacIzExcela.getStringData("MyAddressTests", 8, 2);
		String city = citacIzExcela.getStringData("MyAddressTests", 9, 2);
		String zip = citacIzExcela.getStringData("MyAddressTests", 11, 2);
		addressFormFilling(address, city, zip);
	
		
		String textForAssertion = citacIzExcela.getStringData("MyAddressTests", 15, 2);
		
		String actualText = myAddressPage.textAfterUpdatingAddress();
		assertEquals(actualText, textForAssertion);
	}
	
	
	
	
	
	@Test(priority = 10)
	public void addingNewAddress() throws InterruptedException {
		
		String username = citacIzExcela.getStringData("LoginTests", 6, 2);
		String password = String.valueOf(citacIzExcela.getIntegerData("LoginTests", 7, 2));
		logInFormFilling(username, password);
		
		
		String address = citacIzExcela.getStringData("MyAddressTests", 23, 2);
		String city = citacIzExcela.getStringData("MyAddressTests", 24, 2);
		String zip = citacIzExcela.getStringData("MyAddressTests", 26, 2);
		String mobile = citacIzExcela.getStringData("MyAddressTests", 27, 2);
		String alias = citacIzExcela.getStringData("MyAddressTests", 28, 2);
		newAddressForm(address, city, zip, mobile, alias);
	
		
		String textForAssertion = citacIzExcela.getStringData("MyAddressTests", 32, 2);
		
		String actualText = myAddressPage.textAfterUpdatingAddress();
		assertEquals(actualText, textForAssertion);
		
	}
	
	
	
	
	@Test(priority = 15)
	public void removingAddress() throws InterruptedException {
	
		String username = citacIzExcela.getStringData("LoginTests", 6, 2);
		String password = String.valueOf(citacIzExcela.getIntegerData("LoginTests", 7, 2));
		logInFormFilling(username, password);
		
		myStoreAccountPage.ClickMyAddressTab();
		myAddressPage.ClickDeleteButton();
		driver.switchTo().alert().accept();
		
		String textForAssertion = citacIzExcela.getStringData("MyAddressTests", 32, 2);
		
		String actualText = myAddressPage.textAfterUpdatingAddress();
		assertEquals(actualText, textForAssertion);
		
	}
	
	
	
	
	public void logInFormFilling(String username, String password) {
		myStoreMainPage.ClickSignInTab();
		myStoreLoginPage.insertUsername(username);
		myStoreLoginPage.insertPassword(password);
		myStoreLoginPage.ClickSignInButton();
		myStoreAccountPage.ClickCustomerNameButton();
	}
	
	
	
	
	public void addressFormFilling (String address, String city, String zip) {

		myStoreAccountPage.ClickMyAddressTab();
		myAddressPage.ClickUpdateButton();
		myAddressPage.insertAddress(address);
		myAddressPage.insertCity(city);
		myAddressPage.selectStateOregon();
		myAddressPage.insertPostalCode(zip);
		myAddressPage.ClickSaveButton();
	}
	
	
	
	
	public void newAddressForm (String address, String city, String zip, String mobile, String alias) {

		myStoreAccountPage.ClickMyAddressTab();
		myAddressPage.ClickAddNewAddressButton();
		myAddressPage.insertAddress(address);
		myAddressPage.insertCity(city);
		myAddressPage.selectStateCalifornia();
		myAddressPage.insertPostalCode(zip);
		myAddressPage.insertMobilePhone(mobile);
		myAddressPage.insertAlias(alias);
		myAddressPage.ClickSaveButton();
	}
	
	
	
	
	
	
	@AfterMethod
	public void posleSvakogTesta() throws InterruptedException {		
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
	
	
	
	
	
}
