package stepDefinition;

import base.BaseClass;
import io.cucumber.java.en.*;
import pages.PIMPage;

public class PIMSteps extends BaseClass {

    PIMPage pim;

    @When("user adds a new employee in PIM module")
    public void user_adds_employee() throws InterruptedException {
        pim = new PIMPage(driver);
        pim.addEmployee();
    }

    @Then("employee should be created successfully")
    public void employee_created_successfully() throws InterruptedException {
    	Thread.sleep(10000);
        closeBrowser();
    }
}
