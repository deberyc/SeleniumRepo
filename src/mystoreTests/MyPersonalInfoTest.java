package mystoreTests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyPersonalInfoTest extends MystoreBaseTests  {
	
	
	
	
	@BeforeMethod
	public void preSvakogTesta() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
	}
	
	
	
	
	
	
	@Test(priority = 0)
	public void editingPersonalInformation() throws InterruptedException {
		
		String username = citacIzExcela.getStringData("LoginTests", 6, 2);
		String password = String.valueOf(citacIzExcela.getIntegerData("LoginTests", 7, 2));
		logInFormFilling(username, password);
		
		
		String currentPassword = citacIzExcela.getStringData("PersonalInfoTest", 7, 2);
		personalInfoFormFilling (currentPassword);
		
		
		String textForAssertion = citacIzExcela.getStringData("PersonalInfoTest", 12, 2);
		
		String actualText = myStorePerosnalInfoPage.textFromUpdateInfoMessage();
		assertEquals(actualText, textForAssertion);
	
	}
	
	
	
	
	
	
	
	
	public void logInFormFilling(String username, String password) {
		myStoreMainPage.ClickSignInTab();
		myStoreLoginPage.insertUsername(username);
		myStoreLoginPage.insertPassword(password);
		myStoreLoginPage.ClickSignInButton();
		myStoreAccountPage.ClickCustomerNameButton();
	}
	
	
	public void personalInfoFormFilling (String currentPassword) {

		myStoreAccountPage.ClickMyPersonalInformationTab();
		myStorePerosnalInfoPage.ClickGenderButton();
		myStorePerosnalInfoPage.insertCurrentPassword(currentPassword);
		myStorePerosnalInfoPage.ClickNewsletterBox();
		myStorePerosnalInfoPage.ClickSaveInfoButton();
		
	}
	
	
	
	

	@AfterMethod
	public void posleSvakogTesta() throws InterruptedException {		
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
	
	
	
	

}
