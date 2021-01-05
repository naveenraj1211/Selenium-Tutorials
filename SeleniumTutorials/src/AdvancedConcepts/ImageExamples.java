package AdvancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageExamples {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\MyCompetency_TestAutomation\\MyCompetency_Regression_Automation\\Servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("http://www.leafground.com/pages/Image.html");
		driver.manage().window().maximize();

		WebElement firstImage=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/img"));
		firstImage.click();
		driver.navigate().back();
		WebElement brokenImage=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/img"));
		 
		//"naturalWidth" = 0 means broken image
				if(brokenImage.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println(brokenImage.getAttribute("outerHTML")+"The image is broken");
		}
		else
		{
			System.out.println("The image is NOT broken");
		}

	}

}
