package BasicConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\MyCompetency_TestAutomation\\MyCompetency_Regression_Automation\\Servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		
		WebElement normalAlert = driver.findElement(By.xpath("//button[contains(text(),'Alert Box')]"));
		normalAlert.click();		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();

		
		WebElement confirmAlert = driver.findElement(By.xpath("//button[contains(text(),'Confirm Box')]"));
		confirmAlert.click();
		driver.switchTo().alert();
		Thread.sleep(2000);
		alert.dismiss();
		
		
		WebElement promptAlert = driver.findElement(By.xpath("//button[contains(text(),'Prompt Box')]"));
		promptAlert.click();
		driver.switchTo().alert();
		Thread.sleep(2000);
		alert.sendKeys("Testing prompt alert");
		Thread.sleep(2000);
		alert.accept();
		
	}

}
