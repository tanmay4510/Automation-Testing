package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class multipleScenario {
WebDriver driver;
	@Given("Browser is open1")
	public void browser_is_open1() {
		 driver = new ChromeDriver();
			driver.manage().window().maximize();
	}

	@Given("Cursor is in text box1")
	public void cursor_is_in_text_box1() throws InterruptedException {
		driver.get("https://www.google.com/");
		   Thread.sleep(2000);
	}

	@When("user write some text to search1")
	public void user_write_some_text_to_search1() throws InterruptedException {
		   WebElement box= driver.findElement(By.name("q"));
		   box.sendKeys("India");
		   box.sendKeys(Keys.ENTER);
		   Thread.sleep(2000);
	}

	@Then("User will get search results1")
	public void user_will_get_search_results1() {
		 driver.quit();
	}

	@Given("chrome browser is open1")
	public void chrome_browser_is_open1() throws InterruptedException {
		  driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    Thread.sleep(2000);
	}

	@Given("user is on login page1")
	public void user_is_on_login_page1() {
		 driver.get("https://www.saucedemo.com/");
	}
	
	@When("^user1 enters (.*) and (.*)$")
	public void user1_enters_username_and_password(String username,String password) throws InterruptedException {
	    driver.findElement(By.id("user-name")).sendKeys(username);
	    driver.findElement(By.id("password")).sendKeys(password);
	    Thread.sleep(2000);
	}



	@When("user clicks on login1")
	public void user_clicks_on_login1() throws InterruptedException {
		 driver.findElement(By.id("login-button")).click();
		    Thread.sleep(2000);
	}

	@Then("user is navigated to the page1")
	public void user_is_navigated_to_the_page1() {
		driver.quit();
	}
}
