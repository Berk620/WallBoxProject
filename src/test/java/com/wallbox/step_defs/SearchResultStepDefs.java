package com.wallbox.step_defs;

import com.wallbox.pages.SearchResultPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SearchResultStepDefs {


    @Then("go to movies and click on")
    public void go_to_movies_and_click_on() throws InterruptedException {
      SearchResultPage seachresultpage=new SearchResultPage();
      seachresultpage.movies.click();
      Thread.sleep(3000);

    }

    @Then("verify number of movies")
    public void verify_number_of_movies() {
        SearchResultPage searchresultpage=new SearchResultPage();
        String text = searchresultpage.noOfMovies.getText();
        Assert.assertEquals("2",text);

    }
}
