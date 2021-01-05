package AdvancedConcepts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ExtentReport 
{

	static WebDriver driver;
	static ExtentHtmlReporter htmlReports;
	static ExtentReports extent;	
	static ExtentTest ParentTest;
	static ExtentTest ChildTest;
	String fileName = "C:\\MyCompetency_TestAutomation\\SeleniumTutorials\\ExtentReports\\ExtentReportResults.html";
	
	@BeforeTest
	public void setUp() 
	{
	
		htmlReports = new ExtentHtmlReporter(fileName);
		extent.attachReporter(htmlReports);
		
		htmlReports.config().setReportName("Regression");
		htmlReports.config().setTheme(Theme.STANDARD);
		htmlReports.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReports.config().setDocumentTitle("Naveen Html Reports");
		
		extent.setSystemInfo("Project", "Selenium");
		extent.setSystemInfo("Environment", "Local");
		extent.setSystemInfo("Tester Name","Naveen");
		extent.setSystemInfo("Module Name","Extent Reports");		
		
	}
	
	@Test(priority = 0)
	public void OpenBrowser() 
	{	
		ParentTest = extent.createTest("Open Google using Chrome Browser");
		ChildTest = ParentTest.createNode("Open Browser and go to Google url");
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\MyCompetency_TestAutomation\\MyCompetency_Regression_Automation\\Servers\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();	
		
		ChildTest.log(Status.PASS, MarkupHelper.createLabel("Chrome Browser Opened", ExtentColor.BLUE));
		driver.get("https://www.google.co.in");
		ChildTest.log(Status.PASS, MarkupHelper.createLabel("Naviagated to google page", ExtentColor.BLUE));	
		
	}
	
	@Test(priority = 1)
	public void VerifyTitle() 
	{
	
		ChildTest = ParentTest.createNode("Verifying Page Title");
		ChildTest.info("Actual Page title taken");
		String actual = driver.getTitle();
		assertEquals(actual, "Google");
				
	}
	
	@AfterTest
	public void tearDown() 
	{
		extent.flush();
		System.out.println("Test Execution Completed");
		
	}
	
	@AfterMethod
	public void chekResult(ITestResult testresult) 
	{
		
		if (testresult.getStatus()==ITestResult.FAILURE) 
		{
			ChildTest.log(Status.FAIL, MarkupHelper.createLabel("Test is failed due to below reason", ExtentColor.ORANGE));
			ChildTest.log(Status.FAIL,testresult.getThrowable());
		}
		else if (testresult.getStatus()==ITestResult.SKIP) 
		{
			ChildTest.log(Status.SKIP, MarkupHelper.createLabel("Test is failed due to below reason", ExtentColor.YELLOW));
			ChildTest.log(Status.FAIL,testresult.getThrowable());
		}
		else 
		{
			ChildTest.log(Status.PASS,"Test Case is Passed");
		}
		
	}
	
	
}
