package seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Start Chrome Driver
		System.setProperty("webdriver.chrome.driver", "/home/ssoellavmware/Downloads/chromedriver");
		
		// 2.Create session and open browser
		WebDriver driver = new ChromeDriver();
		
		// 3. Open wikipedia URL
		 driver.get("https://www.wikipedia.org/");
	     
		// 4. Maximize Window
		 driver.manage().window().maximize();
		 
		// find username on webpage and enter data
	        driver.findElement(By.xpath("//*[@id=\"wpName1\"]")).sendKeys("admin");
	        
	        //find password and enter data
	        driver.findElement(By.xpath("//*[@id=\"wpPassword1\"]")).sendKeys("admin@123");
	        
	        driver.findElement(By.xpath("//*[@id=\"wpLoginAttempt\"]")).click();
	}

}
