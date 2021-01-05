package InterviewQuesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TextUnderlinedOrNot {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in");
		
		WebElement tamil=driver.findElement(By.xpath("//a[contains(text(),'தமிழ்')]"));		
		String textStyle=tamil.getCssValue("text-decoration");		
		System.out.println(textStyle);
		Actions action = new Actions(driver);
		action.moveToElement(tamil).build().perform();
		
		String textStyleAfterHovering=tamil.getCssValue("text-decoration");
		System.out.println(textStyleAfterHovering);	
		
		
		

	}
}
