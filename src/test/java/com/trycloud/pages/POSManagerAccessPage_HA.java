package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POSManagerAccessPage_HA {

    public POSManagerAccessPage_HA(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="//input[@id='login']")
    public WebElement username_text_input;


    @FindBy(xpath ="//input[@id='password']")
    public WebElement password_text_input;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement login_button;


    //@FindBy(xpath = "//div[@class='o_mail_thread']")
    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement account_name;


    @FindBy(xpath = "//a[@href='/web#menu_id=115&action=120']")
    public WebElement discuss_module;

    @FindBy(xpath = "//a[@href='/web#menu_id=120&action=136']")
    public WebElement calendar_module;

    @FindBy(xpath = "//a[@href='/web#menu_id=194&action=220']")
    public WebElement notes_module;

    @FindBy(xpath = "//a[@href='/web#menu_id=68&action=']")
    public WebElement contacts_module;

    @FindBy(xpath = "//a[@href='/web#menu_id=261&action=365']")
    public WebElement crm_module;

    @FindBy(xpath = "//a[@href='/web#menu_id=445&action=']")
    public WebElement sales_module;

    @FindBy(xpath = "//a[@href='/web#menu_id=382&action=']")
    public WebElement website_module;

    @FindBy(xpath = "//a[@href='/web#menu_id=484&action=']")
    public WebElement point_of_sale_module;

    @FindBy(xpath = "//a[@href='/web#menu_id=504&action=']")
    public WebElement purchases_module;

    @FindBy(xpath = "//a[@href='/web#menu_id=347&action=']")
    public WebElement inventory_module;

    @FindBy(xpath = "//a[@href='/web#menu_id=415&action=']")
    public WebElement manufacturing_module;

    @FindBy(xpath = "//a[@href='/web#menu_id=535&action=723']")
    public WebElement repairs_module;

    @FindBy(xpath = "//a[@href='/web#menu_id=333&action=']")
    public WebElement project_module;

    @FindBy(xpath = "//a[@href='/web#menu_id=124&action=']")
    public WebElement events_module;

    @FindBy(xpath = "//a[@href='/web#menu_id=475&action=']")
    public WebElement surveys_module;

    @FindBy(xpath = "//a[@href='/web#menu_id=157&action=']")
    public WebElement employees_module;

    @FindBy(xpath = "//a[@href='/web#menu_id=281&action=']")
    public WebElement attendances_module;

    @FindBy(xpath = "//a[@href='/web#menu_id=295&action=']")
    public WebElement leaves_module;

    @FindBy(xpath = "//a[@href='/web#menu_id=388&action=']")
    public WebElement expenses_module;

    @FindBy(xpath = "//a[@href='/web#menu_id=165&action=']")
    public WebElement maintenance_module;

    @FindBy(xpath = "//a[@href='/web#menu_id=134&action=']")
    public WebElement fleet_module;

    @FindBy(xpath = "//a[@href='/web#menu_id=1&action=']")
    public WebElement dashboards_module;




}


