package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ScreenshotUtil;

import java.time.Duration;

public class AdminPage {

    WebDriver driver;
    WebDriverWait wait;

    By userRoleDropdown = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]");
    By statusDropdown = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]");

    By adminOption = By.xpath("//span[text()='Admin']");
    By essOption = By.xpath("//span[text()='ESS']");
    By enabledOption = By.xpath("//span[text()='Enabled']");
    By disabledOption = By.xpath("//span[text()='Disabled']");

    By adminMenu = By.xpath("//span[text()='Admin']");
    By addBtn = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
    By saveBtn = By.xpath("//button[@type='submit']");

    By employeeName = By.xpath("//input[@placeholder='Type for hints...']");
    By usernameField = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    By passwordField = By.xpath("(//input[@type='password'])[1]");
    By confirmPassword = By.xpath("(//input[@type='password'])[2]");

    public AdminPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void selectUserRole(String role) {

        wait.until(ExpectedConditions.elementToBeClickable(userRoleDropdown)).click();

        if (role.equalsIgnoreCase("Admin")) {
            wait.until(ExpectedConditions.elementToBeClickable(adminOption)).click();
        } else if (role.equalsIgnoreCase("ESS")) {
            wait.until(ExpectedConditions.elementToBeClickable(essOption)).click();
        }
    }

    public void selectStatus(String status) {

        wait.until(ExpectedConditions.elementToBeClickable(statusDropdown)).click();

        if (status.equalsIgnoreCase("Enabled")) {
            wait.until(ExpectedConditions.elementToBeClickable(enabledOption)).click();
        } else if (status.equalsIgnoreCase("Disabled")) {
            wait.until(ExpectedConditions.elementToBeClickable(disabledOption)).click();
        }
    }

    public void addUser() {

        wait.until(ExpectedConditions.elementToBeClickable(adminMenu)).click();

        wait.until(ExpectedConditions.elementToBeClickable(addBtn)).click();

        selectUserRole("ESS");

        wait.until(ExpectedConditions.visibilityOfElementLocated(employeeName))
                .sendKeys("Ranga Akunuri");

        selectStatus("Enabled");

        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField))
                .sendKeys("MilligilliUser99");

        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField))
                .sendKeys("Admin@1234");

        wait.until(ExpectedConditions.visibilityOfElementLocated(confirmPassword))
                .sendKeys("Admin@1234");
        ScreenshotUtil.capture(driver, "UserAdded");


        wait.until(ExpectedConditions.elementToBeClickable(saveBtn)).click();
    }
}
