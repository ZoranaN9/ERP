package com.trycloud.step_definitions;

import com.trycloud.pages.Repairs1_Coumns_Page;
import com.trycloud.pages.RepairsJ1_Page;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RepairsJ1_Step_Definitions {

    RepairsJ1_Page repairsJ1_page = new RepairsJ1_Page();

    Repairs1_Coumns_Page repairs1_coumns_page = new Repairs1_Coumns_Page();

    @Given("posManager1 is on the home page")
    public void pos_manager1_is_on_the_home_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        repairsJ1_page.txt_username1.sendKeys(ConfigurationReader.getProperty("possale1.username"));
        repairsJ1_page.txt_password1.sendKeys(ConfigurationReader.getProperty("possale1.password"));
        repairsJ1_page.btn_log_in1.click();

    }
    @When("posManager1 can click Repairs option")
    public void pos_manager1_can_click_repairs_option() {
        BrowserUtils.sleep(1);
        repairsJ1_page.dashboard_name1.click();
    }
    @Then("posManager1 sees {int} table columns")
    public void pos_manager1_sees_table_columns(Integer expected_column_numbers1) {
        //Integer repairColumnNumber1
            Integer actualRepairColumnNumber1 = repairs1_coumns_page.HeaderNames.size();
        Assert.assertEquals(actualRepairColumnNumber1, expected_column_numbers1);
    }


}
