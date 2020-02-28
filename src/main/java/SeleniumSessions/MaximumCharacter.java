package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximumCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.Chrome.driver", "/Users/sasha/Desktop/chromedriver"); 
				System.setProperty("webdriver.chrome.driver", "/Users/sasha/Desktop/chromedriver 3"); 
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://ask.portnov.com/#/login");
	}

}
