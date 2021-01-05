package AdvancedConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteExample {

	public static void main(String[] args) throws InterruptedException
	{
	
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\MyCompetency_TestAutomation\\MyCompetency_Regression_Automation\\Servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		driver.manage().window().maximize();
		
		WebElement input=driver.findElement(By.id("tags"));
		input.sendKeys("s");
		Thread.sleep(4000);
		List<WebElement> optionsList=driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		
		System.out.println(optionsList.size());
		
		for (WebElement option : optionsList) 
		{
			if (option.getText().equals("Web Services")) 
			{
				option.click();
				System.out.println("Inside If");
				break;
			}
			else 
			{
				System.out.println("Option not found");
			}
		}
		
		
	}

}
