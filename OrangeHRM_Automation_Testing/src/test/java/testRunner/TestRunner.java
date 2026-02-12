package testRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.CucumberOptions;
import utils.ExtentManager;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/resources/feature/completeflow.feature"
		,glue= {"stepDefinition"},
		monochrome=true,
		plugin= {"pretty","html:target/HtmlReports.html","json:target/JSONReports.xml"}
		)
public class TestRunner extends AbstractTestNGCucumberTests {
	 public static ExtentReports extent = ExtentManager.getInstance();
	    public static ExtentTest test;

	    @BeforeClass
	    public void setupReport() {
	        extent = ExtentManager.getInstance();
	    }

	    @AfterClass
	    public void tearDownReport() {
	        extent.flush();
	    }
}
