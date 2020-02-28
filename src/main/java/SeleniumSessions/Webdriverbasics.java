package SeleniumSessions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Webdriverbasics {

	public static void main(String[] args) {

		
		//System.setProperty("webdriver.Chrome.driver", "/Users/sasha/Desktop/chromedriver"); 
		System.setProperty("webdriver.chrome.driver", "/Users/sasha/Tools/chromedriver 3"); 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.equals("Google")) {
			System.out.println("correct title");
			
		}
		else
		{ 
			System.out.println("Incorrect title");

		
		}
		driver.quit();
	}
	

}
