package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CalendarPage_CG {
    public CalendarPage_CG() {
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

    @FindBy (xpath = "//tr[@class='fc-minor']")
    public List <String> hours;

    @FindBy (xpath = "//span[normalize-space()='0:00']")
    public WebElement zeroHours;

    @FindBy (xpath = "//span[normalize-space()='1:00']")
    public WebElement oneHours;

    @FindBy (xpath = "//span[normalize-space()='2:00']")
    public WebElement twoHours;

    @FindBy (xpath = "//span[normalize-space()='3:00']")
    public WebElement threeHours;

    @FindBy (xpath = "//span[normalize-space()='4:00']")
    public WebElement fourHours;

    @FindBy (xpath = "//span[normalize-space()='5:00']")
    public WebElement fiveHours;

    @FindBy (xpath = "//span[normalize-space()='6:00']")
    public WebElement sixHours;

    @FindBy (xpath = "//span[normalize-space()='7:00']")
    public WebElement sevenHours;

    @FindBy (xpath = "//span[normalize-space()='8:00']")
    public WebElement eightHours;

    @FindBy (xpath = "//span[normalize-space()='9:00']")
    public WebElement nineHours;

    @FindBy (xpath = "//span[normalize-space()='10:00']")
    public WebElement tenHours;

    @FindBy (xpath = "//span[normalize-space()='11:00']")
    public WebElement elevenHours;

    @FindBy (xpath = "//span[normalize-space()='12:00']")
    public WebElement twelveHours;

    @FindBy (xpath = "//span[normalize-space()='13:00']")
    public WebElement  thirteenHours;

    @FindBy (xpath = "//span[normalize-space()='14:00']")
    public WebElement fourteenHours;

    @FindBy (xpath = "//span[normalize-space()='15:00']")
    public WebElement fifteenHours;

    @FindBy (xpath = "//span[normalize-space()='16:00']")
    public WebElement sixteenHours;

    @FindBy (xpath = "//span[normalize-space()='17:00']")
    public WebElement seventeenHours;

    @FindBy (xpath = "//span[normalize-space()='18:00']")
    public WebElement eigthteenHours;

    @FindBy (xpath = "//span[normalize-space()='19:00']")
    public WebElement nineteenHours;

    @FindBy (xpath = "//span[normalize-space()='20:00']")
    public WebElement twentyHours;

    @FindBy (xpath = "//span[normalize-space()='21:00']")
    public WebElement twentyOneHours;

    @FindBy (xpath = "//span[normalize-space()='22:00']")
    public WebElement twentytwoHours;

    @FindBy (xpath = "//span[normalize-space()='23:00']")
    public WebElement twentythreeHours;













    //span[contains(@class, 'oe_
    // menu_text')
    //tr[contains(@data-time, '00')]


}
