package com.trycloud.step_definitions;

import com.trycloud.pages.CalendarPage_CG;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalendarPageStepDefinitions_CG {
    CalendarPage_CG calendarPage = new CalendarPage_CG();

    @Given("User is on the login page enters username and password and clicks login button")
    public void user_is_on_the_login_page_enters_username_and_password_and_clicks_login_button() {
        calendarPage.username.sendKeys("posmanager17@info.com");
        calendarPage.password.sendKeys("posmanager");
        calendarPage.btn_log_in.click();
    }

    @When("User clicks Calendar option")
    public void user_clicks_calendar_option() {
        BrowserUtils.sleep(3);
        calendarPage.calendar_link.click();
    }


    @Then("User sees time list increase by one our each time.")
    public void userSeesTimeListIncreaseByOneOurEachTime() {

    }


    @Then("User should sees below time list by default")
    public void userShouldSeesBelowTimeListByDefault(String expectedHours) {
        String actaulName = calendarPage.zeroHours.getText();
        Assert.assertEquals(actaulName,expectedHours);




       // List <String> actualHours = calendarPage.hours;

       // List <String> actualhoursAsString = new ArrayList<>();

      //  for (WebElement each : actualHours) {
         //   actualhoursAsString.add(each.getText());
      //  }

        //Assert.assertEquals(actualHours,expectedHours);



    }

}
