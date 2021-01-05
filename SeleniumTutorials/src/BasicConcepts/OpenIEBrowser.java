package BasicConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class OpenIEBrowser {

	public static void main(String[] args) {
		
		// 1. naveen opening ie browser
		// 2. Navigate to Google Home page

		
		
		System.setProperty("webdriver.ie.driver", 
				"C:\\MyCompetency_TestAutomation\\MyCompetency_Regression_Automation\\Servers\\IEDriverServer32.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.co.in");
		
		
		
		
		

	}

}
