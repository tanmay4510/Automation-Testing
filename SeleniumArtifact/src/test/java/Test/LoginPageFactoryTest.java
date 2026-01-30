package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPageFactory;

public class LoginPageFactoryTest {
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		LoginPageFactory loginPage;
		
		driver= new ChromeDriver();
		loginPage= new LoginPageFactory(driver);
		
		loginPage.navigateTo();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		loginPage.login("standard_user", "secret_sauce");
		
		loginPage.navigateTo();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		loginPage.login("invalid_user", "secret_sauc");
		
		 System.out.println(loginPage.getErrorMsg());
		
		driver.quit();

	}

}
