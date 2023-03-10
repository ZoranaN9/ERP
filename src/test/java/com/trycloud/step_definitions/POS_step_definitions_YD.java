package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPOS_Page_YD;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class POS_step_definitions_YD {
LoginPOS_Page_YD loginPOS_page_yd= new LoginPOS_Page_YD();


    @Given("posManager is on the log in page")
    public void pos_manager_is_on_the_log_in_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        System.out.println("POS Manager is on the login page");

    }

    @When("pos manager enters valid credentials")
    public void the_user_enter_username_and_password() {
        loginPOS_page_yd.txt_username.sendKeys(ConfigurationReader.getProperty("posmanager13@infor.com"));
        System.out.println("posmanager");
        loginPOS_page_yd.btn_log_in.click();

    }





}