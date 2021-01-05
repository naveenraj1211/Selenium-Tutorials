package BasicConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FindElement {

	public static void main(String[] args) {
		// Finding a element in web page using any one of the following
		
		// id, name, className, xpath, cssSelector, linkText, partialLinkText, tag
		
		
		System.setProperty("webdriver.ie.driver", 
				"C:\\MyCompetency_TestAutomation\\MyCompetency_Regression_Automation\\Servers\\IEDriverServer32.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.co.in");
		
		driver.findElement(By.name("q")).sendKeys("india"+Keys.ENTER);

	}

}
