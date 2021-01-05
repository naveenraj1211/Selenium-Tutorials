package AdvancedConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksExtendedExample {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", 
				"C:\\MyCompetency_TestAutomation\\MyCompetency_Regression_Automation\\Servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		
		
		WebElement homePageLink=driver.findElement(By.linkText("Go to Home Page"));
		homePageLink.click();
		driver.navigate().back();
		
		WebElement whereToGo=driver.findElement(By.partialLinkText("Find where"));		
		String urlwhere = whereToGo.getAttribute("href");		
		System.out.println(urlwhere);
		
		WebElement brokenLink=driver.findElement(By.linkText("Verify am I broken?"));
		brokenLink.click();
		String title = driver.getTitle();
		if (title.contains("404")) 
		{
			System.out.println("Link is broken");
		}
		driver.navigate().back();
		
		//If we use already identified again we will get element is not attached to document
		//homePageLink.click();
		
		WebElement homePageLink1=driver.findElement(By.linkText("Go to Home Page"));
		homePageLink1.click();

		driver.navigate().back();
		List<WebElement> totalLinks=driver.findElements(By.tagName("a"));
		int linkCount=	totalLinks.size();
		System.out.println("Total links "+linkCount);
		
	}

}
