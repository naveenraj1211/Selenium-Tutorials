package AdvancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderExample {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", 
				"C:\\MyCompetency_TestAutomation\\MyCompetency_Regression_Automation\\Servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("http://www.leafground.com/pages/Calendar.html");
		driver.manage().window().maximize();
		
		   WebElement calendar=driver.findElement(By.id("datepicker"));
		   //calendar.sendKeys("10/02/2020"+Keys.ENTER);		   
		   calendar.click();
		    
		   WebElement nextButton=driver.findElement(By.xpath("//a[@title='Next']"));
		   nextButton.click();
		   
		   WebElement dateToBeGiven=driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		   dateToBeGiven.click();

	}

}
