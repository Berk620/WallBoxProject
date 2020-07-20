package com.wallbox.step_defs;

import com.wallbox.utilities.ConfigurationReader;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.List;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class GetAPIStepDefs {
    static Response response;
    static List<String> listOfAll = new ArrayList<>();

    @Given("user connects to  www.themoviedb.org url")
    public void user_connects_to_www_themoviedb_org_url() {
        baseURI = ConfigurationReader.get("urlAPI");

    }

    @When("user gets response")
    public void user_gets_response() {

      //  String apikey = "e0600da4bb11c86319fd1a07b90202b2";


        for (int i = 1; i <= 10; i++) {

            response = given().accept(ContentType.JSON).when().
                    queryParams("api_key", ConfigurationReader.get("api_key"), "page", i)
                    .and().get();
            List<String> listOfMovies = response.body().path("results.title");
            listOfAll.addAll(listOfMovies);

        }
    }
    @Then("verify that the statusCode is {int}")
    public void verify_the_statusCode_is(Object int1) {
        Assert.assertEquals(int1, response.getStatusCode());

    }

    @Then("verify that the contentType is {string}")
    public void verify_the_contentType_is(String string) {
        Assert.assertEquals(string, response.getContentType());
    }

    @Then("verify that ten pages has {int} top-rated movies")
    public void verify_that_ten_pages_has_top_rated_movies(Object numOfMovies) {
        Assert.assertEquals(numOfMovies, listOfAll.size());

    }
}