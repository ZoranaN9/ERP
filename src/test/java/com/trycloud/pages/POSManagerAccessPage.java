package com.trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POSManagerAccessPage {

    @FindBy(xpath =  "//input[@id='login']")
    public WebElement email_text_box;


    @FindBy(xpath ="//input[@id='password']" )
    public WebElement password_text_box;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement login_button;


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

    @FindBy(xpath = "")
    public WebElement crm_module;

    @FindBy(xpath = "")
    public WebElement sales_module;

    @FindBy(xpath = "")
    public WebElement website_module;

    @FindBy(xpath = "")
    public WebElement point_of_sale_module;

    @FindBy(xpath = "")
    public WebElement purchases_module;

    @FindBy(xpath = "")
    public WebElement inventory_module;

    @FindBy(xpath = "")
    public WebElement manufacturing_module;

    @FindBy(xpath = "")
    public WebElement repairs_module;

    @FindBy(xpath = "")
    public WebElement project_module;

    @FindBy(xpath = "")
    public WebElement events_module;

    @FindBy(xpath = "")
    public WebElement surveys_module;

    @FindBy(xpath = "")
    public WebElement employees_module;

    @FindBy(xpath = "")
    public WebElement attendances_module;

    @FindBy(xpath = "")
    public WebElement leaves_module;

    @FindBy(xpath = "")
    public WebElement expenses_module;

    @FindBy(xpath = "")
    public WebElement maintenance_module;

    @FindBy(xpath = "")
    public WebElement fleet_module;

    @FindBy(xpath = "")
    public WebElement dashboards_module;





}
