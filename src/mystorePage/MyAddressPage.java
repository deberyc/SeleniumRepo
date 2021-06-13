package mystorePage;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MyAddressPage {
	
	
	WebDriver driver;
	
	WebElement updateButton;
	WebElement addressField;
	WebElement cityField;
	Select state;
	WebElement postalCodeField;
	WebElement saveButton;
	WebElement addNewAddressButton;
	WebElement mobilePhoneField;
	WebElement aliasField;
	WebElement deleteField;
	
	
	public MyAddressPage(WebDriver driver) {
		super();
		this.driver = driver;
	}



	public WebElement getUpdateButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[9]/a[1]/span"));
		
	}



	public WebElement getAddressField() {
		return driver.findElement(By.id("address1"));
		
	}



	public WebElement getCityField() {
		return driver.findElement(By.id("city"));
	}



	public WebElement getPostalCodeField() {
		return driver.findElement(By.id("postcode"));
	}



	public WebElement getSaveButton() {
		return driver.findElement(By.id("submitAddress"));
	}

	
	public WebElement getAddNewAddressButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[2]/a"));
	}
	
	
	public WebElement getMobilePhoneField() {
		return driver.findElement(By.id("phone_mobile"));
	}

	

	public WebElement getAliasField() {
		return driver.findElement(By.id("alias"));
	}

	
	public WebElement getDeleteField() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[9]/a[2]/span"));
	}
	
	
	
	
	

	public void insertAddress(String address) {  
		this.getAddressField().clear();
		this.getAddressField().sendKeys(address);
	}
	
	public void insertCity(String city) {  
		this.getCityField().clear();
		this.getCityField().sendKeys(city);
	}
	
	
	public void insertPostalCode(String zip) {  
		this.getPostalCodeField().clear();
		this.getPostalCodeField().sendKeys(zip);
	}
	
	public void insertMobilePhone(String mobile) {  
		this.getMobilePhoneField().clear();
		this.getMobilePhoneField().sendKeys(mobile);
	}
	
	
	public void insertAlias(String alias) {  
		this.getAliasField().clear();
		this.getAliasField().sendKeys(alias);
	}
	
	
	
	public void ClickUpdateButton() {
		
		this.getUpdateButton().click();
	}
	
	
	
	public void ClickAddressField() {
		
		this.getAddressField().clear();
		this.getAddressField().click();
	}
	
	
	
	public void ClickCityField() {
		
		this.getCityField().clear();
		this.getCityField().click();
	}
	
	
	
	public void selectStateOregon() {
		Select state = new Select(driver.findElement(By.id("id_state")));
		state.selectByValue("37");
	}
	
	

	public void ClickPostalCodeField() {
		
		this.getPostalCodeField().clear();
		this.getPostalCodeField().click();
	}

 
	public void ClickSaveButton() {
		
		this.getSaveButton().click();
	}
	
	
	public void ClickAddNewAddressButton() {
		
		this.getAddNewAddressButton().click();
	}
	
	
	public void selectStateCalifornia() {
		Select state = new Select(driver.findElement(By.id("id_state")));
		state.selectByValue("5");
	}
	
	
	public void ClickDeleteButton() {
		
		this.getDeleteField().click();
	}
	
	
	
	
	
	public String textAfterUpdatingAddress() {       
		return this.getUpdateButton().getText();
	}
	
	
	
	
}
