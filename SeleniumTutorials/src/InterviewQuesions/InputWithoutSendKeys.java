package InterviewQuesions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputWithoutSendKeys {

	public static void main(String[] args) throws InterruptedException,AWTException
	{
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();		
		driver.get("http://www.google.co.in");
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Testing");
		Thread.sleep(3000);
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("document.getElementsByName('q')[0].value='javascript executor inputs'", "");		
		Thread.sleep(3000);
		
		
		executor.executeScript("arguments[0].value='Automation Testing'",searchBox);
		Thread.sleep(3000);
		
		driver.switchTo().activeElement();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_U);
		robot.keyRelease(KeyEvent.VK_U);
		
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		

	}

}
