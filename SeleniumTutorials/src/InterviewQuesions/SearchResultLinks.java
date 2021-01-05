package InterviewQuesions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchResultLinks {

	public static void main(String[] args) throws InterruptedException
	{
	
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.manage().window().maximize();
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("India \n");

		Thread.sleep(5000);

		//This will print all the URLs in the Page
		List<WebElement> totalLinks = driver.findElements(By.xpath("//a"));
		System.out.println("Total Links = "+totalLinks.size());
/*		for (WebElement webElement : totalLinks) 
		{			
			System.out.println(webElement.getAttribute("href"));
		}*/
		
		//Fetch main links	
		List<WebElement> mainLinks=
				driver.findElements(By.xpath("//*[@id='search']//following::h3//following::div/cite"));
		System.out.println(mainLinks.size());		
		for(WebElement links:mainLinks)
		{
			System.out.println(links.getText());
		} 
		
		
	}

}
