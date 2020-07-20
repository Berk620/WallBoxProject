package com.wallbox.step_defs;

import com.wallbox.pages.SearchPage;
import com.wallbox.utilities.ConfigurationReader;
import com.wallbox.utilities.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class SearchStepDefs {
    @Given("the user is on the main page")
    public void the_user_is_on_the_main_page() {


        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @Given("the user enter film name {string}")
    public void the_user_enter_film_name(String filmName) {
    SearchPage seachpage=new SearchPage();
    seachpage.searchBox.sendKeys(filmName);
    seachpage.searchBtn.click();
        Assert.assertEquals("https://www.themoviedb.org/search?query=Tom+hanks",Driver.get().getCurrentUrl());


    }
}
