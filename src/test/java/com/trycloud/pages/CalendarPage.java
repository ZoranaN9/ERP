package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CalendarPage {
    public CalendarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement btn_log_in;

    @FindBy(xpath = "(//span[contains(@class, 'oe_menu_text')])[2]")
    public WebElement calendar_link;

    @FindBy (xpath = " //tr[contains(@class, 'fc-minor')]")
    public WebElement half_hours;

    @FindBy (xpath = "//tr[@class='fc-minor']") //here I use not for exclude the half hours
    public List <WebElement> hours;




    //span[contains(@class, 'oe_menu_text')
    //tr[contains(@data-time, '00')]


}
