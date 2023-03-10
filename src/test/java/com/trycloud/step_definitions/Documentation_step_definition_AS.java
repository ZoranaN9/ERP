package com.trycloud.step_definitions;

import com.trycloud.pages.DocumentationPage_AS;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Documentation_step_definition_AS {

  DocumentationPage_AS documentationPage_as = new DocumentationPage_AS();
   @Given("User is on the login page")
    public void userIsOnTheLoginPage() {
     Driver.getDriver().get(ConfigurationReader.getProperty("url"));
     System.out.println("User is on the login page");
  }
  @When("user enters username and password and clicks login button")
  public void userEntersUsernameAndPasswordAndClicksLoginButton() {
    documentationPage_as.username_text_input.sendKeys("posmanager20@info.com");
    documentationPage_as.password_text_input.sendKeys("posmanager");
    documentationPage_as.btn_login.click();

  }

    @When("user holder name should be {string}")
    public void userHolderNameShouldBe(String expectedName ) {
     String actualName = documentationPage_as.dashboard_name.getText();
      Assert.assertEquals(actualName,expectedName);
    }
   @When("User is able to click on account holder name")
   public void userIsAbleToClickOnAccountHolderName() {
     documentationPage_as.dashboard_name.click();
  }
    @When("User is able to click on Documentation button")
    public void userIsAbleToClickOnDocumentationButton() {
       documentationPage_as.documentation_dropdown.click();
        BrowserUtils.sleep(2);
   }



    @Then("User is able to see {int} main documentation topics")
    public void userIsAbleToSeeMainDocumentationTopics(int arg0) {
    }



}

