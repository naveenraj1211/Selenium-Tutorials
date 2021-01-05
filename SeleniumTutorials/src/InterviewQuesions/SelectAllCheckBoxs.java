package InterviewQuesions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllCheckBoxs {

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();	
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		List<WebElement> allCheckBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int i=1;
		for (WebElement webElement : allCheckBox) 
		{
			if(webElement.isSelected()) 
			{
				System.out.println("Check Box "+i+" is already selected");
			}
			else 
			{
				webElement.click();
				System.out.println("Checkbox "+i+" is selected");
			}
			i++;
		}

	}

}
