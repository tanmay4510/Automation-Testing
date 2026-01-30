package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/resources/feature/multipleScenario.feature"
		,glue= {"stepDefinition"},
		monochrome=true,tags="@run2",
		plugin= {"pretty","html:target/HtmlReports.html","json:target/JSONReports.xml"}
		)
public class TestRunner2 {

}
