package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Even_Manager_Discuss_Page {

    public Even_Manager_Discuss_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='o_thread_title']")
    public WebElement DiscussMessage;




}
