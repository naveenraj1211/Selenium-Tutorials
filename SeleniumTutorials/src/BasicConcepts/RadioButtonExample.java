package BasicConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\MyCompetency_TestAutomation\\MyCompetency_Regression_Automation\\Servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("http://www.leafground.com/pages/radio.html");
	
		WebElement yesBtn = driver.findElement(By.id("yes"));
		WebElement unCheckedBtn = driver.findElement(By.xpath("//input[@name='news' and @value='0']"));
		WebElement checkedBtn = driver.findElement(By.xpath("//input[@name='news' and @value='1']"));
		WebElement below20 = driver.findElement(By.name("age"));
		
		yesBtn.click();
		boolean statusUnChecked = unCheckedBtn.isSelected();
		System.out.println("statusUnChecked "+statusUnChecked);
		
		boolean statusChecked = checkedBtn.isSelected();
		System.out.println("statusChecked "+statusChecked);
		
		below20.click();

	}

}
