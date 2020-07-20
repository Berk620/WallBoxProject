package com.wallbox.step_defs;

import com.wallbox.utilities.ConfigurationReader;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import java.util.Map;
import static io.restassured.RestAssured.*;

public class PostAPIStepDefs {
    static Response post;

    @Given("user connects to  Post url")
    public void user_connects_to_https_api_themoviedb_org_movie_rating_url() {
        baseURI = ConfigurationReader.get("urlPostAPI");

    }

    @When("user posts a rating")
    public void user_posts_a_rating(Map<String, Integer> rate) {
        post = given().accept(ContentType.JSON).and().contentType(ContentType.JSON).and()
                .queryParams("api_key", ConfigurationReader.get("api_key"), "session_id", ConfigurationReader.get("session_id"))
                .when().body(rate).and().post();


    }

    @Then("verify that the status_Code is {int}")
    public void verify_that_the_status_Code_is(Object status_Code) {
        Assert.assertEquals(status_Code, post.getStatusCode());


    }
}
