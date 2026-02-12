package stepDefinition;

import base.BaseClass;
import io.cucumber.java.en.*;
import pages.PIMPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PIMSteps extends BaseClass {

    PIMPage pim;

    @When("user adds a new employee in PIM module")
    public void user_adds_employee() {

       

        pim = new PIMPage(driver);
        pim.addEmployee();

        test.info("Employee creation process started");
    }

    @Then("employee should be created successfully")
    public void employee_created_successfully() {

       
        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//h6[text()='Personal Details']")));

        String screenshotPath = captureScreenshot("EmployeeAdded");

        test.pass("Employee created successfully")
            .addScreenCaptureFromPath(screenshotPath);

        closeBrowser();
    }
}
