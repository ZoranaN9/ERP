package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPOS_Page_YD;
import com.trycloud.pages.PointOfSale_Page_YD;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class POS_step_definitions_YD {
LoginPOS_Page_YD loginPOS_page_yd= new LoginPOS_Page_YD();

/*
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
 */



    PointOfSale_Page_YD pointOfSale_page_yd = new PointOfSale_Page_YD();
    @Given("POS manager clicks orders option on side bar")
    public void posManagerClicksOrdersOptionOnSideBar() {
        loginPOS_page_yd.txt_username.sendKeys("posmanager13@info.com");
        loginPOS_page_yd.txt_password.sendKeys("posmanager");
        loginPOS_page_yd.btn_log_in.click();
        BrowserUtils.sleep(3);
      pointOfSale_page_yd.btn_point_of_sale.click();
      BrowserUtils.sleep(3);
      pointOfSale_page_yd.orders_link.click();
      BrowserUtils.sleep(3);
    }

    @When("click the checkbox")
    public void clickTheCheckbox() {
      pointOfSale_page_yd.check_box.click();
      BrowserUtils.sleep(3);
    }


    @Then("all the orders should be checked")
    public void allTheOrdersShouldBeChecked() {
    String isSelected ="true";
        for (WebElement each : pointOfSale_page_yd.all_the_orders) {
            if(each.isSelected()==false){
                isSelected="false";
            }
        }

        System.out.println("(pointOfSale_page_yd.all_the_orders.size()) = " + (pointOfSale_page_yd.all_the_orders.size()));

        String expected = "true";
        Assert.assertEquals(expected, isSelected);



    }


    @Given("POS manager clicks Action dropdown")
    public void posManagerClicksActionDropdown() {
    pointOfSale_page_yd.action_drop_down.click();
    BrowserUtils.sleep(3);
    }




    @When("the Action drop down should have two options :  Export, Delete")
    public void theActionDropDownShouldHaveTwoOptionsExportDelete() {
    String export = "true";
    String delete ="true";
  if(pointOfSale_page_yd.export.isDisplayed()){
      export="false";

  }


  if(pointOfSale_page_yd.delete.isDisplayed()){
      delete="false";

  }

  Assert.assertTrue(export,true);
        Assert.assertTrue(delete,true);





    }
}