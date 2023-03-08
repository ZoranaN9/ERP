package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPOS_Page_ZN;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class pos_step_definitions_ZN {
   LoginPOS_Page_ZN loginPOS_page_zn = new LoginPOS_Page_ZN();

    @Given("posManager is on the log in page")
    public void pos_manager_is_on_the_log_in_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        System.out.println("POS Manager is on the login page");

    }
    @When("the user enter username")
    public void the_user_enter_username() {
        loginPOS_page_zn.txt_username.sendKeys(ConfigurationReader.getProperty("pos.username"));
        System.out.println("User enter username");;

    }
    @When("the user enter password")
    public void the_user_enter_password() {
        loginPOS_page_zn.txt_password.sendKeys(ConfigurationReader.getProperty("pos.password"));
        System.out.println("User enter password");

    }




}
