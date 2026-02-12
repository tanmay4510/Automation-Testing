package stepDefinition;

import base.BaseClass;
import io.cucumber.java.en.*;
import pages.AdminPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AdminSteps extends BaseClass {

    AdminPage admin;

    @When("user adds a new user in Admin module")
    public void user_adds_new_user() {


        admin = new AdminPage(driver);
        admin.addUser();

        test.info("User creation process started");
    }

    @Then("user should be added successfully")
    public void user_added_successfully() {

       
        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//h5[text()='System Users']")));

        String screenshotPath = captureScreenshot("UserAdded");

        test.pass("User added successfully")
            .addScreenCaptureFromPath(screenshotPath);

        closeBrowser();
    }
}
