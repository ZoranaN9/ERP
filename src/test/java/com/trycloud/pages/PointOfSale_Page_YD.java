package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PointOfSale_Page_YD {

    public PointOfSale_Page_YD(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = " //span[@class='oe_menu_text']")
    public WebElement btn_point_of_sale;

    @FindBy(xpath="//a[@href='/web#menu id=489&action=663']")
    public WebElement orders_link;
}
