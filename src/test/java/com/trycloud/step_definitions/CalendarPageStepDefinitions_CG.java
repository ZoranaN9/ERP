package com.trycloud.step_definitions;

import com.trycloud.pages.CalendarPage_CG;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

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


    @Then("User should sees below time list by default")
    public void userShouldSeesBelowTimeListByDefault(List<String> expectedHours) {


        ArrayList<WebElement> allTheHours = new ArrayList<WebElement>();
        allTheHours.add(calendarPage.zeroHours);
        allTheHours.add(calendarPage.oneHours);
        allTheHours.add(calendarPage.twoHours);
        allTheHours.add(calendarPage.threeHours);
        allTheHours.add(calendarPage.fourHours);
        allTheHours.add(calendarPage.fiveHours);
        allTheHours.add(calendarPage.sixHours);
        allTheHours.add(calendarPage.sevenHours);
        allTheHours.add(calendarPage.eightHours);
        allTheHours.add(calendarPage.nineHours);
        allTheHours.add(calendarPage.tenHours);
        allTheHours.add(calendarPage.elevenHours);
        allTheHours.add(calendarPage.twelveHours);
        allTheHours.add(calendarPage.thirteenHours);
        allTheHours.add(calendarPage.fourteenHours);
        allTheHours.add(calendarPage.fifteenHours);
        allTheHours.add(calendarPage.sixteenHours);
        allTheHours.add(calendarPage.seventeenHours);
        allTheHours.add(calendarPage.eigthteenHours);
        allTheHours.add(calendarPage.nineteenHours);
        allTheHours.add(calendarPage.twentyHours);
        allTheHours.add(calendarPage.twentyOneHours);
        allTheHours.add(calendarPage.twentytwoHours);
        allTheHours.add(calendarPage.twentythreeHours);


        List<String> allTheHoursText = new ArrayList<>();

        for (WebElement each : allTheHours) {
            allTheHoursText.add(each.getText());
        }

        System.out.println("actual hours from the web" + allTheHoursText);

        System.out.println("hours from the scenario" + expectedHours);
        Assert.assertEquals(expectedHours, allTheHoursText);



        }
        }


