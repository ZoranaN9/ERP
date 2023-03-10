package com.trycloud.step_definitions;

import com.trycloud.pages.RepairsJ_Page_JJ;
import com.trycloud.pages.Repairs_Coumns_Page;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Repairs_Step_Definitions_JJ {

    RepairsJ_Page_JJ repairsJPage = new RepairsJ_Page_JJ();

    Repairs_Coumns_Page repairs_coumns_page = new Repairs_Coumns_Page();

    @Given("posManager is on the home page")
    public void pos_manager_is_on_the_home_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        repairsJPage.txt_username.sendKeys(ConfigurationReader.getProperty("possale.username"));
        repairsJPage.txt_password.sendKeys(ConfigurationReader.getProperty("possale.password"));
        repairsJPage.btn_log_in.click();
    }
    @When("posManager can click Repairs option")
    public void pos_manager_can_click_repairs_option() {

        BrowserUtils.sleep(1);
        repairsJPage.dashboard_name.click();
    }
    @Then("posManager sees {int} table columns")
    public void pos_manager_sees_table_columns(Integer expected_column_numbers) {
    Integer actualRepairsColumnNumber = repairs_coumns_page.headerNames.size();
        Assert.assertEquals(actualRepairsColumnNumber,expected_column_numbers);

    }




}
