package mystorePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyStoreAccountPage {
	

	WebDriver driver;
	
	WebElement signOutButton;
	WebElement signInButton;
	WebElement customerNameButton;
	WebElement myAddressTab;
	WebElement myPersonalInformationTab;
	WebElement myWishlistsTab;
	WebElement homeButton;
	

	public MyStoreAccountPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	

	public WebElement getSignOutButton() {
		return driver.findElement(By.className("logout"));
	}
	
	
	public WebElement getSignInButton() {
		return driver.findElement(By.className("login"));
	}
	
	
	public WebElement getCustomerNameButton() {
		return driver.findElement(By.className("account"));
	}

	
	public WebElement getMyAddressTab() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a/span"));
	}

	
	public WebElement getMyPersonalInformationTab() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a/span"));
	}


	public WebElement getMyWishlistsTab() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[2]/ul/li/a/span"));
	}


	public WebElement getHomeButton() {
		return driver.findElement(By.xpath("//a[contains(@title, 'Home')]"));
	}
	
	

	
	public void ClickSignOutButton() {
		
		this.getSignOutButton().click();
	}
	
	
	public void ClickCustomerNameButton() {
		
		this.getCustomerNameButton().click();
	}
	
	
	public void ClickMyAddressTab() {
		
		this.getMyAddressTab().click();
	}
	
	
	public void ClickMyPersonalInformationTab() {
		
		this.getMyPersonalInformationTab().click();
	}
	
	
	public void ClickMyWishlistsTab() {
		
		this.getMyWishlistsTab().click();
	}
	
	
	public void clickOnHomeButton() {
		getHomeButton().click();
	}
	
	
	
	
	
	
	
	public String textFromSignOutButton() {       
		return this.getSignOutButton().getText();
	}
	
	
	public String textFromSignInButton() {       
		return this.getSignInButton().getText();
	}

	
	public String textFromCustomerButton() {       
		return this.getCustomerNameButton().getText();
	}
	
	
	
	
	
	
}
