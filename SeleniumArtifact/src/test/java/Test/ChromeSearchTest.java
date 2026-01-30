package Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.*;
public class ChromeSearchTest {
	
	static WebDriver driver;
	
	public static void search_test() throws InterruptedException {
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		ChromeSearchPage.text_box(driver).sendKeys("India");
		ChromeSearchPage.text_box(driver).sendKeys(Keys.ENTER);
		
	}
	public static void main(String[] args) throws InterruptedException {
		search_test();
		Thread.sleep(2000);
		driver.quit();
	}
}
