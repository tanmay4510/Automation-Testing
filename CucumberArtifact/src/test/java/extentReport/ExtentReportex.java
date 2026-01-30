package extentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportex {
	
	static ExtentReports extent;
	static ExtentSparkReporter spark;
	
	@BeforeClass
	public void starttest() {
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("target/Spark.html");
	}
	
	@Test
	
	public void extenttest() {
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("AutomationReport");
		spark.config().setReportName("ReportDemo");
		
		extent.attachReporter(spark);
		
		ExtentTest test = extent.createTest("Login Test").assignAuthor("Tanmay");
		test.pass("Login Sucessfull");
		test.info("value Entered");
		test.pass("login test completed");
		test.fail("My test case failed");
		ExtentTest test1 = extent.createTest("HomePage Test").assignAuthor("Tanmay");
		test1.pass("homepage Sucessfull");
		test1.info("value Entered");
		test1.fail("homepage failed");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		if(driver.getTitle().equals("Google1")) {
			test.log(Status.PASS,"Navigated to the URL");
		}
		else {
			test1.log(Status.FAIL, "Test Failed");
		}
		
		driver.quit();
		
	}
	
	@AfterMethod
	
	public void teardown() {
		extent.flush();
	}

}
