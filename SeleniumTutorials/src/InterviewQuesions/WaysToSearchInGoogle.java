package InterviewQuesions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WaysToSearchInGoogle {

	public static void main(String[] args) throws AWTException {

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver= new ChromeDriver(chromeOptions);
		
		driver.get("http://www.google.co.in");
		
		WebElement searchBox=driver.findElement(By.name("q"));
		
		//searchBox.sendKeys("selenium testing"+Keys.ENTER);
		searchBox.sendKeys("Automation");
		//searchBox.submit();
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
