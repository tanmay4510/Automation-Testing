package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChromeSearchPage {
	
		static WebElement element= null;
		public static WebElement text_box(WebDriver driver) {
			element= driver.findElement(By.name("q"));
			return element;
		}
}
