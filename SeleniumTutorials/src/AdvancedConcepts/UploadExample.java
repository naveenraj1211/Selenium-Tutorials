package AdvancedConcepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadExample {

	public static void main(String[] args) throws AWTException, InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", 
				"C:\\MyCompetency_TestAutomation\\MyCompetency_Regression_Automation\\Servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("http://www.leafground.com/pages/upload.html");
		driver.manage().window().maximize();
		
				
		WebElement uploadButton=driver.findElement(By.name("filename"));

		String	file="C:\\Users\\naveenraj.durairaj\\Downloads\\testleaf.xlsx";
		//uploadButton.sendKeys(file);// sendskey is working fine
		
		uploadButton.click();
		// windows controls begins here
		Thread.sleep(3000);
		// To copy the content in clip board
		StringSelection selection = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null); 
		
		// TO paste in files explorer popup
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		

	}

}
