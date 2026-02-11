package stepDefinition;

import base.BaseClass;
import io.cucumber.java.en.*;
import pages.AdminPage;

public class AdminSteps extends BaseClass {

    AdminPage admin;

    @When("user adds a new user in Admin module")
    public void user_adds_new_user() throws InterruptedException {
        admin = new AdminPage(driver);
        admin.addUser();
    }

    @Then("user should be added successfully")
    public void user_added_successfully() throws InterruptedException {
    	Thread.sleep(10000);
        closeBrowser();
    }
}
