package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PointOfSale_Page_YD {

    public PointOfSale_Page_YD(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath =" //a[@href='/web#menu_id=484&action=']")
    public WebElement btn_point_of_sale;

    @FindBy(xpath="//a[@href='/web#menu_id=489&action=663']")
    public WebElement orders_link;


    @FindBy(xpath="//th[@class='o_list_record_selector']")
    public WebElement check_box;

    @FindBy(xpath = "//td//input[@type='checkbox']")
    public List<WebElement> all_the_orders;

    @FindBy(xpath ="//div[@class='btn-group']")
    public WebElement action_drop_down;


 @FindBy(xpath ="(//ul[@class='dropdown-menu'])[4]")
  public List<WebElement> action_options;


@FindBy(linkText = "Export")
 public WebElement export;

 @FindBy(linkText = "Delete")
 public WebElement delete;










}
