package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Event_Manager_Page {

    public Event_Manager_Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='login']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginBtn;

    @FindBy(xpath = "//span[normalize-space()='Discuss']")
    public WebElement DiscussBtn;

    public  void login(String EM_UserName, String EM_Password){

        userName.sendKeys(EM_UserName);
        password.sendKeys(EM_Password);
        BrowserUtils.sleep(1);
        loginBtn.click();


    }

}

