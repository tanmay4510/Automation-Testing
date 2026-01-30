package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	private final String url="https://www.saucedemo.com/";
	
	private By usernameField = By.id("user-name");
	private By passwordField = By.id("password");
	private By loginButton = By.id("login-button");
	private By errorMsg = By.cssSelector("h3[data-test='error']");
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void navigateTo() {
		
			driver.get(url);
		
	}
	public void login(String username, String password) throws InterruptedException {
		driver.findElement(usernameField).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(passwordField).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(loginButton).click();
		Thread.sleep(2000);
	}
	
	public String getErrorMsg() {
		return driver.findElement(errorMsg).getText();
	}
	

}
