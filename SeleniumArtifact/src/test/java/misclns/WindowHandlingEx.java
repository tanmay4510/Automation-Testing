package misclns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingEx {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String initialHandle= driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
	
		driver.get("https://www.google.com/imghp?hl=en&ogbl");
		Thread.sleep(2000);
		driver.switchTo().window(initialHandle);
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	
}
