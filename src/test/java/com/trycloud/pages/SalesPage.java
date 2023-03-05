package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesPage {

    public SalesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login")
    public WebElement username_text_input;

    @FindBy(id = "password")
    public WebElement password_text_input;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement btn_login;

    @FindBy(xpath = "//a[@href='/web#menu_id=445&action=']")
    public WebElement sales_link;

    @FindBy(xpath = "//th[@class='o_column_sortable']")
    public WebElement table_headers;

}
