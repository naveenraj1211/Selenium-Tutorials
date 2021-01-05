package InterviewQuesions;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeSreenshotExample {

	public static void main(String[] args) throws IOException, AWTException
	{

		/******The problem with this built-in option is, 
		 * it can take the snap on only a particular portion but not the entire screen.
		 *  If there are any alerts present on the screen and if we want to take the screenshot then, 
		 *  TakesScreenshot is not suitable. We can use the Robot class's 
		 *  createScreenCapture method to capture the full-screen screenshot.*******/
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\MyCompetency_TestAutomation\\MyCompetency_Regression_Automation\\Servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.navigate().to("http://www.leafground.com/pages/Alert.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button")).click();

		
	/*	TakesScreenshot screenshot = (TakesScreenshot) driver;
		File OutputFile	= screenshot.getScreenshotAs(OutputType.FILE);
		File file = new File("C:\\Users\\naveenraj.durairaj\\Downloads\\Documents\\image.png");
		FileHandler.copy(OutputFile, file);*/
		
		
		Robot robot = new Robot();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(screenSize);
		BufferedImage source = robot.createScreenCapture(rectangle);
		
		File dest = new File("C:\\Users\\naveenraj.durairaj\\Downloads\\Documents\\robotimage.png");
		ImageIO.write(source, "png", dest);
		
	}

}
