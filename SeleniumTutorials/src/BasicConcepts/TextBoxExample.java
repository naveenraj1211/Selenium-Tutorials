package BasicConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxExample {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\MyCompetency_TestAutomation\\MyCompetency_Regression_Automation\\Servers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		
		WebElement emailBox = driver.findElement(By.id("email"));
		emailBox.sendKeys("email address");
		
		WebElement appendBox = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		appendBox.sendKeys("new word");
		
		WebElement valueBox = driver.findElement(By.name("username"));
		String DefaultText = valueBox.getAttribute("value");
		System.out.println("Get default text entered	"+DefaultText);
		
		WebElement clearBox = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		clearBox.clear();
		
		
		WebElement disableBox = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		if (disableBox.isEnabled()) 
		{
			System.out.println("Text box 5 is enabled");
		} else 
		{
			System.out.println("Text box 5 is disabled");
		}
	}

}
