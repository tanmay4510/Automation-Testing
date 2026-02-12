package stepDefinition;

import base.BaseClass;
import io.cucumber.java.en.*;
import pages.LoginPage;
import utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginSteps extends BaseClass {

    LoginPage login;

    @Given("user is logged into OrangeHRM")
    public void user_is_logged_into_orangehrm() {

        launchBrowser();

        test = extent.createTest("Login Test");

        login = new LoginPage(driver);
        login.loginToOrangeHRM(
                ConfigReader.getProperty("username"),
                ConfigReader.getProperty("password")
        );

       
        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//h6[text()='Dashboard']")));

        String screenshotPath = captureScreenshot("Dashboard");

        test.pass("Login successful")
            .addScreenCaptureFromPath(screenshotPath);
    }
}
