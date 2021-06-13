package mystorePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyStorePerosnalInfoPage {
	
	
	WebDriver driver;
	
	WebElement genderButton;
	WebElement currentPassword;
	WebElement newsletterBox;
	WebElement saveInfoButton;
	WebElement updateInfoMessage;
	
	
	public MyStorePerosnalInfoPage(WebDriver driver) {
		super();
		this.driver = driver;
	}



	public WebElement getGenderButton() {
		return driver.findElement(By.id("id_gender1"));
	}



	public WebElement getCurrentPassword() {
		return driver.findElement(By.id("old_passwd"));
	}


	public WebElement getNewsletterBox() {
		return driver.findElement(By.id("newsletter"));
	}
	


	public WebElement getSaveInfoButton() {
		return  driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/form/fieldset/div[11]/button/span"));
	}

	
	public WebElement getUpdateInfoMessage() {
		return driver.findElement(By.cssSelector(".alert.alert-success"));
	}



	
	public void ClickGenderButton() {
		
		this.getGenderButton().click();
	}
	
	
	public void insertCurrentPassword(String currentPassword) {  
		this.getCurrentPassword().clear();
		this.getCurrentPassword().sendKeys(currentPassword);
	}
	
	
	
	
	public void ClickNewsletterBox() {
		
		this.getNewsletterBox().click();
	}
	
	
	public void ClickSaveInfoButton() {
		
		this.getSaveInfoButton().click();
	}


	public String textFromUpdateInfoMessage() {
		return this.getUpdateInfoMessage().getText();
		
	}
	
	
}
