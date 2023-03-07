package com.trycloud.step_definitions;

import com.trycloud.pages.SalesPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SalesPageStepDefinitions {

    SalesPage salesPage = new SalesPage();

    @Given("posManager is on the login page enters username and password and clicks login button")
    public void posmanagerIsOnTheLoginPageEntersUsernameAndPasswordAndClicksLoginButton() {
        salesPage.username_text_input.sendKeys("posmanager15@info.com");
        salesPage.password_text_input.sendKeys("posmanager");
        salesPage.btn_login.click();
    }

    @When("posManager clicks Sales option")
    public void pos_manager_clicks_sales_option() {
        BrowserUtils.sleep(3);
        salesPage.sales_link.click();
    }

    @Then("posManager sees {int} table columns with quotations")
    public void pos_manager_sees_table_columns_with_quotations(Integer expectedAmountOfHeaders) {
        BrowserUtils.sleep(3);
        Integer actualAmountOfHeaders = salesPage.table_headers.size();
        expectedAmountOfHeaders = 6;

        Assert.assertEquals(actualAmountOfHeaders, expectedAmountOfHeaders);
    }


    @Given("salesManager is on the login page enters username and password and clicks login button")
    public void salesmanagerIsOnTheLoginPageEntersUsernameAndPasswordAndClicksLoginButton() {
        salesPage.username_text_input.sendKeys("salesmanager55@info.com");
        salesPage.password_text_input.sendKeys("salesmanager");
        salesPage.btn_login.click();
    }

    @When("salesManager clicks Sales option")
    public void sales_manager_clicks_sales_option() {
        /*
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("Odoo"));
         */

        BrowserUtils.sleep(3);
        salesPage.sales_link.click();
    }

    @Then("salesManager sees {int} table columns with quotations")
    public void sales_manager_sees_table_columns_with_quotations(Integer expectedAmountOfHeaders) {
        BrowserUtils.sleep(3);
        Integer actualAmountOfHeaders = salesPage.table_headers.size();
        expectedAmountOfHeaders = 6;

        Assert.assertEquals(actualAmountOfHeaders, expectedAmountOfHeaders);
    }


}
