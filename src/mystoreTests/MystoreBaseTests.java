package mystoreTests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import mystorePage.MyAddressPage;
import mystorePage.MyStoreAccountPage;
import mystorePage.MyStoreLoginPage;
import mystorePage.MyStoreLogoutPage;
import mystorePage.MyStoreMainPage;
import mystorePage.MyStorePerosnalInfoPage;
import mystorePage.MyStoreShoppingCartSummaryPage;
import mystorePage.MyWishlistsPage;

public class MystoreBaseTests {
	
	
	WebDriver driver;
	WebDriverWait wait;
	
	MyStoreMainPage myStoreMainPage;
	MyStoreLoginPage myStoreLoginPage;
	MyStoreAccountPage myStoreAccountPage;
	MyStoreLogoutPage myStoreLogoutPage;
	MyAddressPage myAddressPage;
	MyStorePerosnalInfoPage myStorePerosnalInfoPage;
	MyWishlistsPage myWishlistsPage;
	MyStoreShoppingCartSummaryPage myStoreShoppingCartSummaryPage;
	
	MystoreExcelReader citacIzExcela; 
	String homeUrl;
	
	
	
	@BeforeClass
	public void preSvihTestova() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		
		myStoreMainPage = new MyStoreMainPage(driver);
		myStoreLoginPage = new MyStoreLoginPage(driver);
		myStoreAccountPage = new MyStoreAccountPage(driver);
		myStoreLogoutPage = new MyStoreLogoutPage(driver);
		myAddressPage = new MyAddressPage(driver);
		myStorePerosnalInfoPage = new MyStorePerosnalInfoPage(driver);
		myWishlistsPage = new MyWishlistsPage(driver);
		myStoreShoppingCartSummaryPage = new MyStoreShoppingCartSummaryPage(driver);
		
		citacIzExcela =  new MystoreExcelReader("data/MyStore.xlsx"); 
		homeUrl = "http://automationpractice.com/index.php";
	}
	
	
	
	@AfterClass
	public void posleSvihTestova() {
		driver.close();
	}
	
	
	
	
	
	
	
}
