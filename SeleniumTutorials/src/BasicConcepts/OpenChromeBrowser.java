package BasicConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) 
	
	{
		// 1. naveen opening chrome browser
		// 2. Navigate to Google Home page

		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\MyCompetency_TestAutomation\\MyCompetency_Regression_Automation\\Servers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		
		driver.get("https://www.google.co.in");
		
		
		
	}

}
