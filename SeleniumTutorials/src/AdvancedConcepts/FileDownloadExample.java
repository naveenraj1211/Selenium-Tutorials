package AdvancedConcepts;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadExample {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\MyCompetency_TestAutomation\\MyCompetency_Regression_Automation\\Servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/download.html");
		WebElement downloadLink=driver.findElement(By.linkText("Download Excel"));		
		downloadLink.click();		
		Thread.sleep(3000);
		
		File fileLocation = new File("C:\\Users\\naveenraj.durairaj\\Downloads");
		
		File[] fileList = fileLocation.listFiles();
		
		for (File file : fileList) 
		{
			if (file.getName().equals("testleaf.xlsx")) 
			{
				System.out.println("File is downloaded succesfully");
				break;
			}
		}
		

	}

}
