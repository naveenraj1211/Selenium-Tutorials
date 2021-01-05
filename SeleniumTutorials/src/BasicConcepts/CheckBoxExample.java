package BasicConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\MyCompetency_TestAutomation\\MyCompetency_Regression_Automation\\Servers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		
		WebElement Btn1 = driver.findElement(By.xpath("//div[text()='Java']/input"));
		Btn1.click();
		
		WebElement Btn2 = driver.findElement(By.xpath("//div[text()='Selenium']/input"));
		boolean status =Btn2.isSelected();
		System.out.println("selenium button status "+status);
		
		
		WebElement notselected = driver.findElement(By.xpath("//div[text()='Not Selected']/input"));
		if (notselected.isSelected()) 
		{
			notselected.click();	
		}
		WebElement selected = driver.findElement(By.xpath("//div[text()='I am Selected']/input"));
		if (selected.isSelected()) 
		{
			selected.click();	
		}
	}

}
