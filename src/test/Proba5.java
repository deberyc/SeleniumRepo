package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Proba5 {

	
	
		
		@Test
		public void test() throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//driver.get("https://www.google.com");
			driver.navigate().to("https://itbootcamp.rs/");
			Thread.sleep(3000);

	}
		
		

}

	