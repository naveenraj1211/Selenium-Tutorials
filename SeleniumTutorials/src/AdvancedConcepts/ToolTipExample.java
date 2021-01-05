package AdvancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipExample {

	public static void main(String[] args) 
	{
	
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\MyCompetency_TestAutomation\\MyCompetency_Regression_Automation\\Servers\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/tooltip.html");
		driver.manage().window().maximize();

		WebElement name=driver.findElement(By.id("age"));
		
		Actions action = new Actions(driver);
		action.moveToElement(name).build().perform();
		
		String toolTipText = name.getAttribute("title");
		System.out.println(toolTipText);

	}

}
