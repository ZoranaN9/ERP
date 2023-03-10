package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Repairs1_Coumns_Page {

    public Repairs1_Coumns_Page (){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//th[@class='o_column_sortable']")
    public List<WebElement> HeaderNames;


}
