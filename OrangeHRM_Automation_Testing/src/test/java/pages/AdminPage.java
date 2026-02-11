package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {

    WebDriver driver;
    
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
    }
    public void selectUserRole(String role) {
        driver.findElement(userRoleDropdown).click();

        if (role.equalsIgnoreCase("Admin")) {
            driver.findElement(adminOption).click();
        } else if (role.equalsIgnoreCase("ESS")) {
            driver.findElement(essOption).click();
        }
    }
    public void selectStatus(String status) {
        driver.findElement(statusDropdown).click();

        if (status.equalsIgnoreCase("Enabled")) {
            driver.findElement(enabledOption).click();
        } else if (status.equalsIgnoreCase("Disabled")) {
            driver.findElement(disabledOption).click();
        }
    }


    public void addUser() throws InterruptedException {

        driver.findElement(adminMenu).click();
        Thread.sleep(2000);

        driver.findElement(addBtn).click();
        Thread.sleep(2000);
        
        selectUserRole("ESS");

        driver.findElement(employeeName).sendKeys("Ranga Akunuri");
        Thread.sleep(2000);
        
        selectStatus("Enabled");

        driver.findElement(usernameField).sendKeys("TanmayUser99");
        driver.findElement(passwordField).sendKeys("Admin@1234");
        driver.findElement(confirmPassword).sendKeys("Admin@1234");

        driver.findElement(saveBtn).click();
    }
}
