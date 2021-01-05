package InterviewQuesions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshWays {

	public static void main(String[] args) throws AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\MyCompetency_TestAutomation\\MyCompetency_Regression_Automation\\Servers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();		
		driver.get("http://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("Testing");
		driver.findElement(By.name("q")).sendKeys(Keys.F5);
		
		
		//Refresh command 
		//driver.navigate().refresh();

		//Get current URL
		//driver.get(driver.getCurrentUrl());

		//JavascriptExecutor		
		//JavascriptExecutor executor = (JavascriptExecutor) driver;
		//executor.executeScript("location.reload()");
		//executor.executeScript("history.go(0)");
		
		/*Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);*/
		
		
		

	}

}
