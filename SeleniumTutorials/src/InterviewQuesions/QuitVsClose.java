package InterviewQuesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\MyCompetency_TestAutomation\\MyCompetency_Regression_Automation\\Servers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("http://www.leafground.com/pages/Window.html");
		
		WebElement firstButton=driver.findElement(By.id("home"));
		firstButton.click();
		
		Thread.sleep(3000);
		driver.close(); // closes Current browser window in the sense which is active and is on focus for the driver
		//driver.quit();
		/*This is not the case. The close method will close the browser which the driver has focus.
		 *  Unless we switch the focus to the newly opened window, 
		 * the driver has focused on the old window and the close method will close
		 *  the old window only not the newly opened one.*/
	}

}
