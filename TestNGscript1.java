package seleniumscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGscript1 {


		  WebDriver driver;
		    
		    @Test(priority='1')       // it is a test method
		    public void openbrowser()
		    {
		        System.setProperty("webdriver.chrome.driver", "/home/ssoellavmware/Downloads/chromedriver");
		        driver = new ChromeDriver();
		        driver.get("https://www.google.com/");
		        driver.manage().window().maximize();
		        String title = driver.getTitle(); // will fetch title of the webpage
		        
		        System.out.println("ttile of the webpage is :" + title);
		        
		    }
		    @Test(priority='2')
		     public void naviagte() throws InterruptedException
		     {
		         driver.navigate().to("https://www.selenium.dev/downloads/");
		         Thread.sleep(2000);
		         String title = driver.getTitle(); // will fetch title of the webpage
		         System.out.println("title of the new webpage is :" + title);
		         driver.navigate().back();
		         
		     }
}
		    
		    
		    