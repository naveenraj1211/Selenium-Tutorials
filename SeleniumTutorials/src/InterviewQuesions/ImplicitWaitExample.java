package InterviewQuesions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitExample {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\MyCompetency_TestAutomation\\MyCompetency_Regression_Automation\\Servers\\chromedriver.exe");


		WebDriver driver= new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.phptravels.net/login");

		WebElement userName=driver.findElement(By.name("username"));
		userName.sendKeys("user@phptravels.com");

		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("demouser");

		WebElement submit=driver.findElement(By.xpath("//*[@id='loginfrm']/button"));
		submit.click();

		WebElement profile= driver.findElement(By.xpath("//a[@href='#profile']"));
		profile.click();

		driver.quit();
		
		
		/*4. Pros and cons of Implicit Wait:
--------------------------------------------------------
 a)We cannot mention any explicit condition to be met before performing any operation using Implicit Wait.
b) Implicit Wait, will not bother if the element is hidden or can be interacted. 
If the element is present in the DOM, it will immediately release the wait and will start performing the 
further operations which are not desirable at most of the situations.
c) Implicit Wait is applicable for all the web elements found using the web driver and 
implicit wait has power until driver.quit() is encountered.
d) We can't control the polling time-frequency using implicit wait.*/

	}

}
