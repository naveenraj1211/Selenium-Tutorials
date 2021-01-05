package InterviewQuesions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitExample {

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


		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class); // selenium exception

		WebElement profile = wait.until(
				new Function<WebDriver, WebElement>()
				{
					public WebElement apply(WebDriver driver) 
					{
						return driver.findElement(By.xpath("//a[@href='#profile']"));
					}

				});	
		profile.click();


	}

}
