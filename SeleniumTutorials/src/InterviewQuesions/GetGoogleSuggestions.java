package InterviewQuesions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetGoogleSuggestions {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("http://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("Ind");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> suggetions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		suggetions.size();
		int position = 0;
		Thread.sleep(3000);

		for (WebElement webElement : suggetions) 
		{
			System.out.println(webElement.getText());
			position++;
			if (position==3) 
			{
				webElement.click();
				break;
			}

		}
		driver.navigate().back();
		driver.findElement(By.name("q")).sendKeys("Ind");		
		Thread.sleep(3000);
		List<WebElement> suggetions2 = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		for (WebElement webElement : suggetions2) 
		{
			String value = webElement.getText();
			if (value.contains("Go")) 
			{
				webElement.click();
				break;
			}

		}


	}

}
;