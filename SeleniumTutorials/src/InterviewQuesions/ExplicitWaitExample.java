package InterviewQuesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\MyCompetency_TestAutomation\\MyCompetency_Regression_Automation\\Servers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.phptravels.net/login");
		driver.manage().window().maximize();

		WebElement userName=driver.findElement(By.name("username"));
		userName.sendKeys("user@phptravels.com");

		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("demouser");

		WebElement submit=driver.findElement(By.xpath("//*[@id='loginfrm']/button"));
		submit.click();

		WebDriverWait wait = new WebDriverWait(driver, 20);	
		
		WebElement profile=	wait.until(ExpectedConditions.elementToBeClickable(By.
				xpath("//a[@href='#profile']")));

		profile.click();

		/*****Pros and cons of Explicit Wait:
--------------------------------------------------------
 a)We can mention any (inbuilt conditions are plenty and that is more than enough for any web applications) 
 explicit condition to be met before performing any operation.
b) Explicit wait performs very well when compared to implicit wait and is the widely used wait condition.
c) Explicit Wait is applicable for only the web elements found using the web driver wait and 
has no control over other elements found normally.
d) We can't control the polling time-frequency using Explicit wait. Same is the case with the implicit wait.******/
		
		
	}

}
