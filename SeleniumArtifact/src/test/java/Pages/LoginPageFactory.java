package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	
	private WebDriver driver;
	private final String url="https://www.saucedemo.com/";
	
	@FindBy(id="user-name")
	private WebElement usernameField;
	
	@FindBy(id="password")
	private WebElement passwordField;
	
	@FindBy(id="login-button")
	private WebElement loginButton;
	
	@FindBy(css="h3[data-test='error']")
	private WebElement errorMsg;
	
	public LoginPageFactory(WebDriver driver) {
		this.driver=driver;
	}
	
	public void navigateTo() {
		
			driver.get(url);
			PageFactory.initElements(driver,this);
		
	}
	public void login(String username, String password) throws InterruptedException {
		usernameField.sendKeys(username);
		Thread.sleep(2000);
	    passwordField.sendKeys(password);
		Thread.sleep(2000);
		loginButton.click();
		Thread.sleep(2000);
	}
	
	public String getErrorMsg() {
		return errorMsg.getText();
	}

}
