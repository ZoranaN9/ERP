package com.trycloud.step_definitions;

import com.trycloud.pages.Event_Manager_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Event_Manager_Step_Definitions  {

    Event_Manager_Page event_manager_page =new Event_Manager_Page();



    @When("Event Manager is on the home page")
    public void event_manager_is_on_the_home_page() {
        event_manager_page.login("eventscrmmanager50@info.com","eventscrmmanager");
    }
    @Then("Event Manager can select {string} modules")
    public void event_manager_can_select_modules(String ModulesName) {

    }

    @Then("Event Manager can see {string} message on the Discuss page")
    public void event_manager_can_see_message_on_the_discuss_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
