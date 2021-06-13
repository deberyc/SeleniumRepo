package mystorePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyWishlistsPage {
	
	
	WebDriver driver;
	
	WebElement nameField;
	WebElement saveListField;
	WebElement createdListMessage;
	WebElement deleteSign;
	
	
	
	public MyWishlistsPage(WebDriver driver) {
		super();
		this.driver = driver;
	}


	public WebElement getNameField() {
		return driver.findElement(By.id("name"));
	}


	public WebElement getSaveListField() {
		return driver.findElement(By.xpath("//*[@id=\"submitWishlist\"]/span"));
	}


	public WebElement getCreatedListMessage() {
		return driver.findElement(By.className("page-subheading"));
	}
	
	
	
	public WebElement getDeleteSign() {
		return driver.findElement(By.className("icon-remove"));
	}


	
	
	
	public void insertWishlistName(String listName) {  
		this.getNameField().clear();
		this.getNameField().sendKeys(listName);
	}
	
	public void insertWishlistName2(String listName2) {  
		this.getNameField().clear();
		this.getNameField().sendKeys(listName2);
	}
	
	public void insertWishlistName3(String listName3) {  
		this.getNameField().clear();
		this.getNameField().sendKeys(listName3);
	}
	
	public void ClickSaveListField() {
		
		this.getSaveListField().click();
	}
	
	
	public void ClickDeleteSign() {
		
		this.getDeleteSign().click();
	}
	
	
	
	
	
	public String textAfterCreatedList() {
		return this.getCreatedListMessage().getText();
		
	}

}
