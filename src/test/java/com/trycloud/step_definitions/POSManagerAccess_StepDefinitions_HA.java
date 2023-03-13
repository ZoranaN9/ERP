package com.trycloud.step_definitions;

import com.trycloud.pages.POSManagerAccessPage_HA;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class POSManagerAccess_StepDefinitions_HA {

    POSManagerAccessPage_HA posManagerAccessPage_ha = new POSManagerAccessPage_HA();

    @Given("the POS manager is on the log in page")
    public void pos_manager_is_on_the_log_in_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("the POS manager enters username {string}")
    public void the_pos_manager_enters_username(String string) {
        posManagerAccessPage_ha.username_text_input.sendKeys(ConfigurationReader.getProperty("posmanager.username"));
        System.out.println("POS Manager enters the username");
    }

    @When("the POS manager enter password {string}")
    public void the_pos_manager_enter_password(String string) {
        posManagerAccessPage_ha.password_text_input.sendKeys(ConfigurationReader.getProperty("posmanager.password"));
        System.out.println("POS Manager enters the password");
    }

    @When("the POS manager clicks the log in button")
    public void the_pos_manager_clicks_the_log_in_button() {
    posManagerAccessPage_ha.login_button.click();
        System.out.println("POS Manager clicks the login button");
    }

    @Then("account holder's name should be {string}")
    public void account_holder_s_name_should_be(String string) {
        String expectedAccountName = "POSManager50";
        String actualAccountName = posManagerAccessPage_ha.account_name.getText();
        Assert.assertEquals(actualAccountName,expectedAccountName);
        System.out.println("POS Manager has access to the page as POSManager50");
    }


    @When("the POS manager clicks Discuss")
    public void the_pos_manager_clicks_discuss() {

        if(!(posManagerAccessPage_ha.discuss_module.isDisplayed())){
            posManagerAccessPage_ha.moreDropdownButton.click();
            BrowserUtils.sleep(2);
            posManagerAccessPage_ha.discuss_module.click();
        }else{
            posManagerAccessPage_ha.discuss_module.click();
            BrowserUtils.sleep(3);
        }

    }
    @Then("the POS manager has access to Discuss module")
    public void the_pos_manager_has_access_to_discuss_module() {
        BrowserUtils.verifyTitleContains("#Inbox");

    }

    @When("the POS manager clicks Calendar")
    public void the_pos_manager_clicks_calendar() {

        if(!(posManagerAccessPage_ha.calendar_module.isDisplayed())){
            posManagerAccessPage_ha.moreDropdownButton.click();
            BrowserUtils.sleep(2);
            posManagerAccessPage_ha.calendar_module.click();
        }else{
            posManagerAccessPage_ha.calendar_module.click();
            BrowserUtils.sleep(3);
        }

    }

    @Then("the POS manager has access to Calendar module")
    public void the_pos_manager_has_access_to_calendar_module() {
        BrowserUtils.verifyTitleContains("Meetings");

    }

    @When("the POS manager clicks Notes")
    public void the_pos_manager_clicks_notes() {

        if(!(posManagerAccessPage_ha.notes_module.isDisplayed())){
            posManagerAccessPage_ha.moreDropdownButton.click();
            BrowserUtils.sleep(2);
            posManagerAccessPage_ha.notes_module.click();
        }else{
            posManagerAccessPage_ha.notes_module.click();
            BrowserUtils.sleep(3);
        }

    }

    @Then("the POS manager has access to Notes module")
    public void the_pos_manager_has_access_to_notes_module() {
        BrowserUtils.verifyTitleContains("Notes");

    }

    @When("the POS manager clicks Contacts")
    public void the_pos_manager_clicks_contacts() {

        if(!(posManagerAccessPage_ha.contacts_module.isDisplayed())){
            posManagerAccessPage_ha.moreDropdownButton.click();
            BrowserUtils.sleep(2);
            posManagerAccessPage_ha.contacts_module.click();
        }else{
            posManagerAccessPage_ha.contacts_module.click();
            BrowserUtils.sleep(3);
        }

    }

    @Then("the POS manager has access to Contacts module")
    public void the_pos_manager_has_access_to_contacts_module() {
        BrowserUtils.verifyTitleContains("Contacts");

    }

    @When("the POS manager clicks CRM")
    public void the_pos_manager_clicks_crm() {

        if(!(posManagerAccessPage_ha.crm_module.isDisplayed())){
            posManagerAccessPage_ha.moreDropdownButton.click();
            BrowserUtils.sleep(2);
            posManagerAccessPage_ha.crm_module.click();
        }else{
            posManagerAccessPage_ha.crm_module.click();
            BrowserUtils.sleep(3);
        }

    }

    @Then("the POS manager has access to CRM module")
    public void the_pos_manager_has_access_to_crm_module() {
        BrowserUtils.verifyTitleContains("Pipeline");

    }

    @When("the POS manager clicks Sales")
    public void the_pos_manager_clicks_sales() {

        if(!(posManagerAccessPage_ha.sales_module.isDisplayed())){
            posManagerAccessPage_ha.moreDropdownButton.click();
            BrowserUtils.sleep(2);
            posManagerAccessPage_ha.sales_module.click();
        }else{
            posManagerAccessPage_ha.sales_module.click();
            BrowserUtils.sleep(3);
        }
    }

    @Then("the POS manager has access to Sales module")
    public void the_pos_manager_has_access_to_sales_module() {
        BrowserUtils.verifyTitleContains("Quotations");

    }

    @When("the POS manager clicks Website")
    public void the_pos_manager_clicks_website() {

        if(!(posManagerAccessPage_ha.website_module.isDisplayed())){
            posManagerAccessPage_ha.moreDropdownButton.click();
            BrowserUtils.sleep(2);
            posManagerAccessPage_ha.website_module.click();
        }else{
            posManagerAccessPage_ha.website_module.click();
            BrowserUtils.sleep(3);
        }

    }

    @Then("the POS manager has access to Website module")
    public void the_pos_manager_has_access_to_website_module() {
        BrowserUtils.verifyTitleContains("Dashboard");

    }

    @When("the POS manager clicks Point Of Sale")
    public void the_pos_manager_clicks_point_of_sale() {
        if(!(posManagerAccessPage_ha.point_of_sale_module.isDisplayed())){
            posManagerAccessPage_ha.moreDropdownButton.click();
            BrowserUtils.sleep(2);
            posManagerAccessPage_ha.point_of_sale_module.click();
        }else{
            posManagerAccessPage_ha.point_of_sale_module.click();
            BrowserUtils.sleep(3);
        }

    }

    @Then("the POS manager has access to Point Of Sale module")
    public void the_pos_manager_has_access_to_point_of_sale_module() {
        BrowserUtils.verifyTitleContains("Point of Sale");

    }

    @When("the POS manager clicks Purchases")
    public void the_pos_manager_clicks_purchases() {

        if(!(posManagerAccessPage_ha.purchases_module.isDisplayed())){
            posManagerAccessPage_ha.moreDropdownButton.click();
            BrowserUtils.sleep(2);
            posManagerAccessPage_ha.purchases_module.click();
        }else{
            posManagerAccessPage_ha.purchases_module.click();
            BrowserUtils.sleep(3);
        }

    }

    @Then("the POS manager has access to Purchases module")
    public void the_pos_manager_has_access_to_purchases_module() {
        BrowserUtils.verifyTitleContains("Requests for Quotation");

    }

    @When("the POS manager clicks Inventory")
    public void the_pos_manager_clicks_inventory() {

        if(!(posManagerAccessPage_ha.inventory_module.isDisplayed())){
            posManagerAccessPage_ha.moreDropdownButton.click();
            BrowserUtils.sleep(2);
            posManagerAccessPage_ha.inventory_module.click();
        }else{
            posManagerAccessPage_ha.inventory_module.click();
        }
        BrowserUtils.sleep(3);
    }

    @Then("the POS manager has access to Inventory module")
    public void the_pos_manager_has_access_to_inventory_module() {
        BrowserUtils.verifyTitleContains("Inventory");

    }

    @When("the POS manager clicks Manufacturing")
    public void the_pos_manager_clicks_manufacturing() {

        if(!(posManagerAccessPage_ha.manufacturing_module.isDisplayed())){
            posManagerAccessPage_ha.moreDropdownButton.click();
            BrowserUtils.sleep(2);
            posManagerAccessPage_ha.manufacturing_module.click();
        }else{
            posManagerAccessPage_ha.manufacturing_module.click();
        }
        BrowserUtils.sleep(3);
    }

    @Then("the POS manager has access to Manufacturing module")
    public void the_pos_manager_has_access_to_manufacturing_module() {
        BrowserUtils.verifyTitleContains("Manufacturing Orders");

    }

    @When("the POS manager clicks Repairs")
    public void the_pos_manager_clicks_repairs() {

        if(!(posManagerAccessPage_ha.repairs_module.isDisplayed())){
            posManagerAccessPage_ha.moreDropdownButton.click();
            BrowserUtils.sleep(2);
            posManagerAccessPage_ha.repairs_module.click();
        }else{
            posManagerAccessPage_ha.repairs_module.click();
        }
        BrowserUtils.sleep(3);
    }

    @Then("the POS manager has access to Repairs module")
    public void the_pos_manager_has_access_to_repairs_module() {
        BrowserUtils.verifyTitleContains("Repair Orders");

    }

    @When("the POS manager clicks Project")
    public void the_pos_manager_clicks_project() {

        if(!(posManagerAccessPage_ha.project_module.isDisplayed())){
            posManagerAccessPage_ha.moreDropdownButton.click();
            BrowserUtils.sleep(2);
            posManagerAccessPage_ha.project_module.click();
        }else{
            posManagerAccessPage_ha.project_module.click();
        }
        BrowserUtils.sleep(3);
    }

    @Then("the POS manager has access to Project module")
    public void the_pos_manager_has_access_to_project_module() {
        BrowserUtils.verifyTitleContains("Projects");

    }

    @When("the POS manager clicks Events")
    public void the_pos_manager_clicks_events() {

        if(!(posManagerAccessPage_ha.events_module.isDisplayed())){
            posManagerAccessPage_ha.moreDropdownButton.click();
            BrowserUtils.sleep(2);
            posManagerAccessPage_ha.events_module.click();
        }else{
            posManagerAccessPage_ha.events_module.click();
        }
        BrowserUtils.sleep(3);
    }

    @Then("the POS manager has access to Events module")
    public void the_pos_manager_has_access_to_events_module() {
        BrowserUtils.verifyTitleContains("Events");

    }

    @When("the POS manager clicks Surveys")
    public void the_pos_manager_clicks_surveys() {

        if(!(posManagerAccessPage_ha.surveys_module.isDisplayed())){
            posManagerAccessPage_ha.moreDropdownButton.click();
            BrowserUtils.sleep(2);
            posManagerAccessPage_ha.surveys_module.click();
        }else{
            posManagerAccessPage_ha.surveys_module.click();
        }
        BrowserUtils.sleep(3);
    }

    @Then("the POS manager has access to Surveys module")
    public void the_pos_manager_has_access_to_surveys_module() {
        BrowserUtils.verifyTitleContains("Surveys");

    }

    @When("the POS manager clicks Employees")
    public void the_pos_manager_clicks_employees() {

        if(!(posManagerAccessPage_ha.employees_module.isDisplayed())){
            posManagerAccessPage_ha.moreDropdownButton.click();
            BrowserUtils.sleep(2);
            posManagerAccessPage_ha.employees_module.click();
        }else{
            posManagerAccessPage_ha.employees_module.click();
        }
        BrowserUtils.sleep(3);
    }

    @Then("the POS manager has access to Employees module")
    public void the_pos_manager_has_access_to_employees_module() {
        BrowserUtils.verifyTitleContains("Employees");

    }

    @When("the POS manager clicks Attendances")
    public void the_pos_manager_clicks_attendances() {

        if(!(posManagerAccessPage_ha.attendances_module.isDisplayed())){
            posManagerAccessPage_ha.moreDropdownButton.click();
            BrowserUtils.sleep(2);
            posManagerAccessPage_ha.attendances_module.click();
        }else{
            posManagerAccessPage_ha.attendances_module.click();
        }
        BrowserUtils.sleep(3);
    }

    @Then("the POS manager has access to Attendances module")
    public void the_pos_manager_has_access_to_attendances_module() {
        BrowserUtils.verifyTitleContains("Attendance");

    }
    @When("the POS manager clicks Leaves")
    public void the_pos_manager_clicks_leaves() {

        if(!(posManagerAccessPage_ha.leaves_module.isDisplayed())){
            posManagerAccessPage_ha.moreDropdownButton.click();
            BrowserUtils.sleep(2);
            posManagerAccessPage_ha.leaves_module.click();
        }else{
            posManagerAccessPage_ha.leaves_module.click();
        }
        BrowserUtils.sleep(3);
    }

    @Then("the POS manager has access to Leaves module")
    public void the_pos_manager_has_access_to_leaves_module() {
        BrowserUtils.verifyTitleContains("All Leaves");

    }
    @When("the POS manager clicks Expenses")
    public void the_pos_manager_clicks_expenses() {

        if(!(posManagerAccessPage_ha.expenses_module.isDisplayed())){
            posManagerAccessPage_ha.moreDropdownButton.click();
            BrowserUtils.sleep(2);
            posManagerAccessPage_ha.expenses_module.click();
        }else{
            posManagerAccessPage_ha.expenses_module.click();
        }
        BrowserUtils.sleep(3);
    }
    @Then("the POS manager has access to Expenses module")
    public void the_pos_manager_has_access_to_expenses_module() {
        BrowserUtils.verifyTitleContains("My Expenses to Submit");

    }
    @When("the POS manager clicks Maintenance")
    public void the_pos_manager_clicks_maintenance() {

        if(!(posManagerAccessPage_ha.maintenance_module.isDisplayed())){
            posManagerAccessPage_ha.moreDropdownButton.click();
            BrowserUtils.sleep(2);
            posManagerAccessPage_ha.maintenance_module.click();
        }else{
            posManagerAccessPage_ha.maintenance_module.click();
        }
        BrowserUtils.sleep(3);
    }
    @Then("the POS manager has access to Maintenance module")
    public void the_pos_manager_has_access_to_maintenance_module() {
        BrowserUtils.verifyTitleContains("Maintenance Teams");

    }
    @When("the POS manager clicks Fleet")
    public void the_pos_manager_clicks_fleet() {

        if(!(posManagerAccessPage_ha.fleet_module.isDisplayed())){
            posManagerAccessPage_ha.moreDropdownButton.click();
            BrowserUtils.sleep(2);
            posManagerAccessPage_ha.fleet_module.click();
        }else{
            posManagerAccessPage_ha.fleet_module.click();
        }
        BrowserUtils.sleep(3);
    }
    @Then("the POS manager has access to Fleet module")
    public void the_pos_manager_has_access_to_fleet_module() {
        BrowserUtils.verifyTitleContains("Vehicles");

    }
    @When("the POS manager clicks Dashboards")
    public void the_pos_manager_clicks_dashboards() {

        if(!(posManagerAccessPage_ha.dashboards_module.isDisplayed())){
            posManagerAccessPage_ha.moreDropdownButton.click();
            BrowserUtils.sleep(2);
            posManagerAccessPage_ha.dashboards_module.click();
        }else{
            posManagerAccessPage_ha.dashboards_module.click();
        }
        BrowserUtils.sleep(3);
    }
    @Then("the POS manager has access to Dashboards module")
    public void the_pos_manager_has_access_to_dashboards_module() {
        BrowserUtils.verifyTitleContains("My Dashboard");

    }


}
