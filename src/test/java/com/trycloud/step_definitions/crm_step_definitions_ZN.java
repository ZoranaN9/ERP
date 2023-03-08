package com.trycloud.step_definitions;

import com.trycloud.pages.LoginCRM_Page_ZN;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class crm_step_definitions_ZN {
    LoginCRM_Page_ZN loginCRM_page_zn = new LoginCRM_Page_ZN();

    @Given("crmManager is on the log in page")
    public void crmmanagerIsOnTheLogInPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        System.out.println("User is on the login page");
    }

    @When("the user enter username {string}")
    public void the_user_enter_username(String string) {
        loginCRM_page_zn.txt_username.sendKeys(ConfigurationReader.getProperty("crm.username"));
        System.out.println("User enter username");
    }
    @When("the user enter password {string}")
    public void the_user_enter_password(String string) {
        loginCRM_page_zn.txt_password.sendKeys(ConfigurationReader.getProperty("crm.password"));
        System.out.println("User enter password");
    }

    @When("the user clicks the log in button")
    public void the_user_clicks_the_log_in_button() {
       loginCRM_page_zn.btn_log_in.click();

    }

    @Then("account holder name should be {string}")
    public void account_holder_name_should_be(String expectedName) {
        String actualName = loginCRM_page_zn.dashboard_name.getText();

        Assert.assertEquals(actualName, expectedName);

    }
}
