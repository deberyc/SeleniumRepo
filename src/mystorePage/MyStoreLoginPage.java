package mystorePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyStoreLoginPage {
	
	
	WebDriver driver;
	
	WebElement emailField;
	WebElement passwordField;
	WebElement signInButton;
	WebElement errorMessageUsername;
	WebElement errorMessagePassword;
	WebElement errorMessageEmpty;
	
	
	
	public MyStoreLoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	
	


	public WebElement getEmailField() {
		return driver.findElement(By.id("email"));
	}



	public WebElement getPasswordField() {
		return driver.findElement(By.id("passwd"));
	}



	public WebElement getSignInButton() {
		return driver.findElement(By.id("SubmitLogin"));
	}



	public WebElement getErrorMessageUsername() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/p"));
	}



	public WebElement getErrorMessagePassword() {
		return 	driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/p"));
	
	}
	
	public WebElement getErrorMessageEmpty() {
		return 	driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));
	
	}
	
	
	
	
	public void insertUsername(String username) {  
		this.getEmailField().clear();
		this.getEmailField().sendKeys(username);
	}
	
	public void insertPassword(String password) {  
		this.getPasswordField().clear();
		this.getPasswordField().sendKeys(password);
	}
	
	
	
	
	public void ClickSignInButton() {
		
		this.getSignInButton().click();
	}
	
	
	
	
	public String textFromSignInButton() {
		return this.getSignInButton().getText();
		
	}
	
	
	public String textFromErrorMessageUsername() {
		return this.getErrorMessageUsername().getText();
		
	}
	
	
	
	public String textFromErrorMessagePassword() {
		return this.getErrorMessagePassword().getText();
		
	}
	
	
	public String textFromErrorMessageEmpty() {
		return this.getErrorMessageEmpty().getText();
		
	}
	
	
}
