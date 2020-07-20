package com.wallbox.pages;

import com.wallbox.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {
    public SearchResultPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(className="selected")
    public WebElement movies;

    @FindBy(xpath = "(//span)[12]")
    public WebElement noOfMovies;
    @FindBy(id="company")
    public WebElement companies;
}
