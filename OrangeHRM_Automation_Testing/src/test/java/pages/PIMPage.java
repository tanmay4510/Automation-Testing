package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ScreenshotUtil;

import java.time.Duration;

public class PIMPage {

    WebDriver driver;
    WebDriverWait wait;

    By pimMenu = By.xpath("//span[text()='PIM']");
    By addEmployeeBtn = By.xpath("//a[text()='Add Employee']");
    By firstName = By.name("firstName");
    By lastName = By.name("lastName");
    By saveBtn = By.xpath("//button[@type='submit']");

    public PIMPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void addEmployee() {

        wait.until(ExpectedConditions.elementToBeClickable(pimMenu))
                .click();

        wait.until(ExpectedConditions.elementToBeClickable(addEmployeeBtn))
                .click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName))
                .sendKeys("Milligilli");

        wait.until(ExpectedConditions.visibilityOfElementLocated(lastName))
                .sendKeys("Chilligilli");
        ScreenshotUtil.capture(driver, "EmployeeAdded");


        wait.until(ExpectedConditions.elementToBeClickable(saveBtn))
                .click();
    }
}
