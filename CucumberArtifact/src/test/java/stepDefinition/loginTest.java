package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginTest {
    WebDriver driver;
	@Given("chrome browser is open")
	public void chrome_browser_is_open() throws InterruptedException {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	   
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
	   driver.get("https://www.saucedemo.com/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) throws InterruptedException {
	    driver.findElement(By.id("user-name")).sendKeys(username);
	    driver.findElement(By.id("password")).sendKeys(password);
	    Thread.sleep(2000);
	}

	@When("user clicks on login")
	public void user_clicks_on_login() throws InterruptedException {
	    driver.findElement(By.id("login-button")).click();
	    Thread.sleep(2000);
	}

	@Then("user is navigated to the page")
	public void user_is_navigated_to_the_page() {
	   driver.quit();
	}


}
