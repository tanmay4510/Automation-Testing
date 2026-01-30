package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/resources/feature/test.feature"
		,glue= {"stepDefinition"},
		monochrome=true,
		plugin= {"pretty","html:target/HtmlReports.html","json:target/JSONReports.xml"}
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
