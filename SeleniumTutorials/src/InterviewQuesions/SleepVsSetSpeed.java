package InterviewQuesions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepVsSetSpeed {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();		
		driver.navigate().to("http://www.google.co.in");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("India"+Keys.ENTER);

		//There is no setSpeed method in Webdriver
/*		setSpeed() is not present in Selenium Webdriver. 
		It was present in the IDE and Remote Control version of Selenium but is now deprecated.*/

	}

}
