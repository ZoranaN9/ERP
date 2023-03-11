package com.trycloud.step_definitions;

import com.trycloud.pages.POSManagerAccessPage_HA;
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
    public void the_pos_manager_clicks_discuss() throws InterruptedException {
        posManagerAccessPage_ha.discuss_module.click();
        Thread.sleep(2000);


    }
    @Then("the POS manager has access to Discuss module")
    public void the_pos_manager_has_access_to_discuss_module() {


    }

    @When("the POS manager clicks Calendar")
    public void the_pos_manager_clicks_calendar() throws InterruptedException {
        posManagerAccessPage_ha.calendar_module.click();

        Thread.sleep(2000);

    }

    @Then("the POS manager has access to Calendar module")
    public void the_pos_manager_has_access_to_calendar_module() {


    }

    @When("the POS manager clicks Notes")
    public void the_pos_manager_clicks_notes() throws InterruptedException {
        posManagerAccessPage_ha.notes_module.click();
        Thread.sleep(2000);
    }

    @Then("the POS manager has access to Notes module")
    public void the_pos_manager_has_access_to_notes_module() {


    }

    @When("the POS manager clicks Contacts")
    public void the_pos_manager_clicks_contacts() throws InterruptedException {
        posManagerAccessPage_ha.contacts_module.click();
        Thread.sleep(2000);
    }

    @Then("the POS manager has access to Contacts module")
    public void the_pos_manager_has_access_to_contacts_module() {


    }

    @When("the POS manager clicks CRM")
    public void the_pos_manager_clicks_crm() throws InterruptedException {
        posManagerAccessPage_ha.crm_module.click();
        Thread.sleep(3000);

    }

    @Then("the POS manager has access to CRM module")
    public void the_pos_manager_has_access_to_crm_module() {


    }

    @When("the POS manager clicks Sales")
    public void the_pos_manager_clicks_sales() throws InterruptedException {
        posManagerAccessPage_ha.sales_module.click();
        Thread.sleep(3000);

    }

    @Then("the POS manager has access to Sales module")
    public void the_pos_manager_has_access_to_sales_module() {


    }

    @When("the POS manager clicks Website")
    public void the_pos_manager_clicks_website() throws InterruptedException {
        posManagerAccessPage_ha.website_module.click();
        Thread.sleep(3000);

    }

    @Then("the POS manager has access to Website module")
    public void the_pos_manager_has_access_to_website_module() {


    }

    @When("the POS manager clicks Point Of Sale")
    public void the_pos_manager_clicks_point_of_sale() throws InterruptedException {
        posManagerAccessPage_ha.point_of_sale_module.click();
        Thread.sleep(3000);

    }

    @Then("the POS manager has access to Point Of Sale module")
    public void the_pos_manager_has_access_to_point_of_sale_module() {


    }

    @When("the POS manager clicks Purchases")
    public void the_pos_manager_clicks_purchases() throws InterruptedException {
        posManagerAccessPage_ha.purchases_module.click();
        Thread.sleep(3000);

    }

    @Then("the POS manager has access to Purchases module")
    public void the_pos_manager_has_access_to_purchases_module() {


    }

    @When("the POS manager clicks Inventory")
    public void the_pos_manager_clicks_inventory() throws InterruptedException {
        posManagerAccessPage_ha.inventory_module.click();
        Thread.sleep(3000);

    }

    @Then("the POS manager has access to Inventory module")
    public void the_pos_manager_has_access_to_inventory_module() {


    }

    @When("the POS manager clicks Manufacturing")
    public void the_pos_manager_clicks_manufacturing() throws InterruptedException {
        posManagerAccessPage_ha.manufacturing_module.click();
        Thread.sleep(3000);

    }

    @Then("the POS manager has access to Manufacturing module")
    public void the_pos_manager_has_access_to_manufacturing_module() {


    }

    @When("the POS manager clicks Repairs")
    public void the_pos_manager_clicks_repairs() throws InterruptedException {
        posManagerAccessPage_ha.repairs_module.click();
        Thread.sleep(3000);

    }

    @Then("the POS manager has access to Repairs module")
    public void the_pos_manager_has_access_to_repairs_module() {


    }

    @When("the POS manager clicks Project")
    public void the_pos_manager_clicks_project() throws InterruptedException {
        posManagerAccessPage_ha.project_module.click();
        Thread.sleep(3000);

    }

    @Then("the POS manager has access to Project module")
    public void the_pos_manager_has_access_to_project_module() {


    }

    @When("the POS manager clicks Events")
    public void the_pos_manager_clicks_events() throws InterruptedException {
        posManagerAccessPage_ha.events_module.click();
        Thread.sleep(3000);

    }

    @Then("the POS manager has access to Events module")
    public void the_pos_manager_has_access_to_events_module() {


    }

    @When("the POS manager clicks Surveys")
    public void the_pos_manager_clicks_surveys() throws InterruptedException {
        posManagerAccessPage_ha.surveys_module.click();
        Thread.sleep(3000);

    }

    @Then("the POS manager has access to Surveys module")
    public void the_pos_manager_has_access_to_surveys_module() {


    }

    @When("the POS manager clicks Employees")
    public void the_pos_manager_clicks_employees() throws InterruptedException {
        posManagerAccessPage_ha.employees_module.click();
        Thread.sleep(3000);

    }

    @Then("the POS manager has access to Employees module")
    public void the_pos_manager_has_access_to_employees_module() {


    }

    @When("the POS manager clicks Attendances")
    public void the_pos_manager_clicks_attendances() throws InterruptedException {
        posManagerAccessPage_ha.attendances_module.click();
        Thread.sleep(3000);

    }

    @Then("the POS manager has access to Attendances module")
    public void the_pos_manager_has_access_to_attendances_module() {


    }
    @When("the POS manager clicks Leaves")
    public void the_pos_manager_clicks_leaves() throws InterruptedException {
        posManagerAccessPage_ha.leaves_module.click();
        Thread.sleep(3000);

    }
    @Then("the POS manager has access to Leaves module")
    public void the_pos_manager_has_access_to_leaves_module() {


    }
    @When("the POS manager clicks Expenses")
    public void the_pos_manager_clicks_expenses() throws InterruptedException {
        posManagerAccessPage_ha.expenses_module.click();
        Thread.sleep(3000);

    }
    @Then("the POS manager has access to Expenses module")
    public void the_pos_manager_has_access_to_expenses_module() {


    }
    @When("the POS manager clicks Maintenance")
    public void the_pos_manager_clicks_maintenance() throws InterruptedException {
        posManagerAccessPage_ha.maintenance_module.click();
        Thread.sleep(3000);

    }
    @Then("the POS manager has access to Maintenance module")
    public void the_pos_manager_has_access_to_maintenance_module() {


    }
    @When("the POS manager clicks Fleet")
    public void the_pos_manager_clicks_fleet() throws InterruptedException {
        posManagerAccessPage_ha.fleet_module.click();
        Thread.sleep(3000);

    }
    @Then("the POS manager has access to Fleet module")
    public void the_pos_manager_has_access_to_fleet_module() {


    }
    @When("the POS manager clicks Dashboards")
    public void the_pos_manager_clicks_dashboards() throws InterruptedException {
        posManagerAccessPage_ha.dashboards_module.click();
        Thread.sleep(3000);

    }
    @Then("the POS manager has access to Dashboards module")
    public void the_pos_manager_has_access_to_dashboards_module() {


    }


}
