package stepDefinition;

import base.BaseClass;
import io.cucumber.java.en.*;
import pages.LoginPage;
import utils.ConfigReader;

public class LoginSteps extends BaseClass {

    LoginPage login;

    @Given("user is logged into OrangeHRM")
    public void user_is_logged_into_orangehrm() {
        launchBrowser();

        login = new LoginPage(driver);
        login.loginToOrangeHRM(
                ConfigReader.getProperty("username"),
                ConfigReader.getProperty("password")
        );
    }
}
