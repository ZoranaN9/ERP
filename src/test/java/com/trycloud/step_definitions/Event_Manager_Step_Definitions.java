package com.trycloud.step_definitions;

import com.trycloud.pages.Even_Manager_Discuss_Page;
import com.trycloud.pages.Event_Manager_Page;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Event_Manager_Step_Definitions  {

    Event_Manager_Page event_manager_page =new Event_Manager_Page();

    Even_Manager_Discuss_Page even_manager_discuss_page = new Even_Manager_Discuss_Page();



    @When("Event Manager is on the home page")
    public void event_manager_is_on_the_home_page() {
        event_manager_page.login("eventscrmmanager50@info.com","eventscrmmanager");
    }
    @Then("Event Manager can select {string} modules")
    public void event_manager_can_select_modules(String ModulesName) {

        event_manager_page.clickModules("Discuss");

    }

    @Then("Event Manager can see {string} message on the Discuss page")
    public void event_manager_can_see_message_on_the_discuss_page(String DiscussMessage) {

        String actualMessage = even_manager_discuss_page.DiscussMessage.getText();
        BrowserUtils.sleep(1);
        Assert.assertEquals(actualMessage,DiscussMessage);

    }
}
