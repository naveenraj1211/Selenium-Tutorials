package BasicConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDwonWExample 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\MyCompetency_TestAutomation\\MyCompetency_Regression_Automation\\Servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("http://www.leafground.com/pages/Dropdown.html");



		WebElement indexDropdown = driver.findElement(By.id("dropdown1"));
		WebElement textDropdown = driver.findElement(By.name("dropdown2"));
		WebElement valueDropdown = driver.findElement(By.id("dropdown3"));
		WebElement optionDropdown = driver.findElement(By.className("dropdown"));		
		WebElement sendDropdown = driver.findElement(By.xpath("(//div[@class='example'])[5]/select"));
		WebElement multiDropdown = driver.findElement(By.xpath("(//div[@class='example'])[6]/select"));
		
		
		
		Select select = new Select(indexDropdown);
		select.selectByIndex(2);
		select = new Select(textDropdown);
		select.selectByVisibleText("UFT/QTP");
		select = new Select(valueDropdown);
		select.selectByValue("3");
		select = new Select(optionDropdown);
		List<WebElement>  list = select.getOptions(); 	//Generics
		int size = list.size();
		System.out.println("Size of the dropdwon: "+size);
		
		sendDropdown.sendKeys("Loadrunner");
		select = new Select(multiDropdown);
		select.selectByIndex(1);
		select.selectByVisibleText("Appium");

	}

}
