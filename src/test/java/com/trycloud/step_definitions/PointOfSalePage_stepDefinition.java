package com.trycloud.step_definitions;

import com.trycloud.pages.PointOfSale_Page_YD;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

public class PointOfSalePage_stepDefinition {




        PointOfSale_Page_YD pointOFSalePage = new PointOfSale_Page_YD();
        private WebElement btn_point_of_sale;


        @When("POSmanager clicks Point of sale option")
        public void pos_manager_clicks_sales_option() {
            BrowserUtils.sleep(3);
            pointOFSalePage.btn_point_of_sale.click();
        }


    @Then("POS manager clicks orders option")
    public void pos_manage_clicks_orders_option(){
        BrowserUtils.sleep(3);
        pointOFSalePage.orders_link.click();

    }





    }
