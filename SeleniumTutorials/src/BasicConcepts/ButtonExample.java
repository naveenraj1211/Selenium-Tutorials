package BasicConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
	
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\MyCompetency_TestAutomation\\MyCompetency_Regression_Automation\\Servers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		driver.get("http://www.leafground.com/pages/Button.html");
		
		
		WebElement homeBtn = driver.findElement(By.id("home"));
		WebElement positionBtn = driver.findElement(By.id("position"));
		WebElement colorBtn = driver.findElement(By.id("color"));
		WebElement sizeBtn = driver.findElement(By.id("size"));
		
		Point xy=positionBtn.getLocation();
		int x= xy.getX(); int y= xy.getY();
		System.out.println("Location of position button ("+x+","+y+")");
		
		 String bgcolor = colorBtn.getCssValue("background-color");
		 System.out.println("color of the button "+bgcolor);
		
		
		 int height = sizeBtn.getSize().getHeight();
		 int width  = sizeBtn.getSize().getWidth();
		 System.out.println("size of the button: Height "+height+"  width "+width);
		 
		 homeBtn.click();
		

	}

}
