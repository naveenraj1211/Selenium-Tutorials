package InterviewQuesions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetVsNavigate {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\MyCompetency_TestAutomation\\MyCompetency_Regression_Automation\\Servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		//driver.get("http://www.google.co.in");//DOM appear wait
		
		driver.navigate().to("http://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("Duckling"+Keys.ENTER);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		/*This is also a classic interview question.
 There are two different ways to launch any URL in selenium. 
They are GET and NAVIGATE methods. Though they both serve the same purpose,
 they have a minor difference. Get can only fetch the current URL whereas, 
navigate() can go back, forward and do a refresh as well. 
This is the widely known answer. In addition to this, they have a minor difference as well.
 Get request will wait for all the elements to get attached to the DOM,
 where are navigate will immediately resume the rest of the operations even if the elements are not attached**/
	}

}
