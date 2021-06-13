package mystorePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyStoreLogoutPage {
	
	
	WebDriver driver;
	
	WebElement signInButton;

	public MyStoreLogoutPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	
	public WebElement getSignInButton() {
		return driver.findElement(By.className("login"));
	}
	
	
	
	
	public String textFromSignInButton() {
		return this.getSignInButton().getText();
		
	}
	
	

}
