package SeleniumSessions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GmailTestCases {
	
	static {
		System.setProperty("webdriver.chrome.driver", "/Users/sasha/Tools/chromedriver 4"); 
	}
	
	public void testLogin() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		
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
	
	public void testLogOut() {
		
	}

	public static void main(String[] args) {
		GmailTestCases gtc = new GmailTestCases();
		
		gtc.testLogin();
		
		gtc.testLogOut();
	}
	

}
