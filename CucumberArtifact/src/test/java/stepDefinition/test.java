package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test {
	WebDriver driver;
	@Given("Browser is open")
	public void browser_is_open() {
	    // Write code here that turns the phrase above into concrete actions
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
	   
	}

	@And("Cursor is in text box")
	public void cursor_is_in_text_box() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   driver.get("https://www.google.com/");
	   Thread.sleep(2000);
	}

	@When("user write some text to search")
	public void user_write_some_text_to_search() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   WebElement box= driver.findElement(By.name("q"));
	   box.sendKeys("India");
	   box.sendKeys(Keys.ENTER);
	   Thread.sleep(2000);
	}

	@Then("User will get search results")
	public void user_will_get_search_results() {
	    // Write code here that turns the phrase above into concrete actions
	 driver.quit();
	}


}
