package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentationPage_AS {

 public DocumentationPage_AS(){
     PageFactory.initElements(Driver.getDriver(),this);

 }
    @FindBy(id = "login")
    public WebElement username_text_input;

    @FindBy(id = "password")
    public WebElement password_text_input;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement btn_login;

    @FindBy(xpath = " //span[@class='oe_topbar_name']")
    public WebElement dashboard_name;

    @FindBy(xpath = "//a[.='Documentation']")
    public  WebElement documentation_dropdown;
}

