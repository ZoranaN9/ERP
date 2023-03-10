package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginManagers_Page_ZN {
    public LoginManagers_Page_ZN(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath =  "//input[@id='login']")
    public WebElement txt_email;
    //input[@id='login']


    @FindBy(xpath =" //input[@name='password']" )
    public WebElement txt_pass;

    @FindBy(xpath = " //button[.='Log in']")
    public WebElement btn_log_in;

    @FindBy(xpath = " //span[@class='oe_topbar_name']")
    public WebElement dashboard_name;
}
