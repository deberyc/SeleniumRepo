package mystorePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyStoreMainPage {
	
	WebDriver driver;
	WebElement signInTab;
	
	
	public MyStoreMainPage(WebDriver driver) {
		super();
		this.driver = driver;
	}


	public WebElement getSignInTab() {
		return driver.findElement(By.className("login"));
	}
	
	
	
	
	public void ClickSignInTab() {
		
		this.getSignInTab().click();
	}
	

}
