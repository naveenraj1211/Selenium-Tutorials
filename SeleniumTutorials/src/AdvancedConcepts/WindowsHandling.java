package AdvancedConcepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException 
	{



		System.setProperty("webdriver.chrome.driver", 
				"C:\\MyCompetency_TestAutomation\\MyCompetency_Regression_Automation\\Servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("http://www.leafground.com/pages/Window.html");

		WebElement firstBtn = driver.findElement(By.id("home"));

		String oldWindow = driver.getWindowHandle();

		firstBtn.click();

		Set<String>	Handles = driver.getWindowHandles();

		for (String newWindow : Handles) 
		{
			driver.switchTo().window(newWindow);
		}

		WebElement editBox = driver.findElement(By.linkText("Edit"));
		editBox.click();

		WebElement emailBox = driver.findElement(By.id("email"));
		emailBox.sendKeys("email address");
		Thread.sleep(2000);
		driver.close();

		driver.switchTo().window(oldWindow);

		WebElement multiWindowBtn= driver.findElement(By.xpath("//button[text()='Open Multiple Windows']"));
		multiWindowBtn.click();
		Set<String> newHandles= driver.getWindowHandles();
		int countWindows= newHandles.size();		 
		System.out.println("Number of opned windows "+countWindows);		
		for (String newWindow : newHandles) 
		{
			if (oldWindow != newWindow)
			{
				driver.switchTo().window(newWindow);
				driver.close();
			}
		}
		
		Thread.sleep(2000);

	}

}

