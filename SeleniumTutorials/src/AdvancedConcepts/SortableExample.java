package AdvancedConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableExample {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\MyCompetency_TestAutomation\\MyCompetency_Regression_Automation\\Servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
		
		List<WebElement> elements=driver.findElements(By.xpath("//*[@id='sortable']/li"));
		
		Actions action = new Actions(driver);
		
		WebElement from = elements.get(4);
		WebElement TO = elements.get(1);
		
		//action.clickAndHold(from).moveToElement(TO).release(TO).build().perform();
		action.dragAndDrop(from, TO).build().perform();
		
		
		

	}

}
