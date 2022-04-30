package seleniumscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//classname method.Name()
		//object.methodname
		// 1. Start Chrome Driver
		System.setProperty("webdriver.chrome.driver", "/home/ssoellavmware/Downloads/chromedriver");
		
		// Create session and open browser
		WebDriver driver = new ChromeDriver();
	}

}
