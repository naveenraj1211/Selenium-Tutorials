package InterviewQuesions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ActiveElementExample {

	static WebElement q;
	public static void main(String[] args) 
	{

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in");
		
		//driver.switchTo().activeElement().sendKeys("Active Element in selenium");
		
		PageFactory.initElements(driver, ActiveElementExample.class);
		q.sendKeys("Selenium \n");

	}

}
