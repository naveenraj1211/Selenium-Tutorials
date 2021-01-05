package AdvancedConcepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPage {

	public static void main(String[] args) throws InterruptedException,AWTException {
		// TODO Auto-generated method stub
	  
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.echoecho.com/htmlforms11.htm");
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		
		//Scroll to some position
		executor.executeScript("window.scroll(0,650)","");
		Thread.sleep(3000);
		executor.executeScript("window.scroll(0,-650)","");
		Thread.sleep(3000);
		
		//Scroll to bottom of the page
		executor.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
		Thread.sleep(3000);
		executor.executeScript("window.scroll(0,0)","");
		Thread.sleep(3000);
		
		//Scroll to element
		WebElement link = driver.findElement(By.linkText("online tool"));
		executor.executeScript("arguments[0].scrollIntoView(true);",link);
		Thread.sleep(3000);
		
		//Scroll using robot class		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		
	}
}
