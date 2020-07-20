package com.wallbox.pages;

import com.wallbox.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    public SearchPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id="inner_search_v4")
    public WebElement searchBox;



    @FindBy(xpath="(//input[@type='submit'])[2]")
    public WebElement searchBtn;



}
