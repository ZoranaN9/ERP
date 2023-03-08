package com.trycloud.step_definitions;

import com.trycloud.pages.LoginManagers_Page_ZN;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Managers_SD_ZN {
    LoginManagers_Page_ZN loginManagers_page_zn = new LoginManagers_Page_ZN();

    @Given("the user is on the log in page")
    public void the_user_is_on_the_log_in_page() {
        Driver.getDriver().get("https://qa.briteerp.com");

    }
    @When("the user enter email {string}")
    public void the_user_enter_email(String email) {
        loginManagers_page_zn.txt_email.sendKeys(email);

    }
    @When("the user enter pass {string}")
    public void the_user_enter_pass(String pass) {
        loginManagers_page_zn.txt_pass.sendKeys(pass);

    }
    @Then("user should see account holder {string}")
    public void user_should_see_account_holder(String expectedName) {
        String actualName = loginManagers_page_zn.dashboard_name.getText();

        Assert.assertEquals(actualName, expectedName);


    }


}
