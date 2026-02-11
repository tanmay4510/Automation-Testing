package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMPage {

    WebDriver driver;

    By pimMenu = By.xpath("//span[text()='PIM']");
    By addEmployeeBtn = By.xpath("//a[text()='Add Employee']");
    By firstName = By.name("firstName");
    By lastName = By.name("lastName");
    By saveBtn = By.xpath("//button[@type='submit']");

    public PIMPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addEmployee() throws InterruptedException {

        driver.findElement(pimMenu).click();
        Thread.sleep(2000);

        driver.findElement(addEmployeeBtn).click();
        Thread.sleep(2000);

        driver.findElement(firstName).sendKeys("Tanmay");
        driver.findElement(lastName).sendKeys("Raj");

        driver.findElement(saveBtn).click();
        driver.findElement(saveBtn).click();
    }
}
