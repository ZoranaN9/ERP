package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOS_Page_YD {

    public LoginPOS_Page_YD() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath =  "//input[@id='login']")
    public WebElement txt_username;
    //input[@id='login']


    @FindBy(xpath =" //input[@name='password']" )
    public WebElement txt_password;

    @FindBy(xpath = " //button[.='Log in']")
    public WebElement btn_log_in;




}
