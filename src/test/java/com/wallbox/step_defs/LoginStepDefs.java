package com.wallbox.step_defs;

import com.wallbox.pages.LoginPage;
import com.wallbox.utilities.ConfigurationReader;
import com.wallbox.utilities.Driver;
import io.cucumber.java.en.*;

public class LoginStepDefs {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url= ConfigurationReader.get("urlLogin");
        Driver.get().get(url);

    }

    @When("the user enter the valid credentials")
    public void the_user_enter_the_valid_credentials() {
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");
        loginPage.login(username,password);

    }

  //  @Then("the user should be able to login")
    //public void the_user_should_be_able_to_login() {

    //}
}
