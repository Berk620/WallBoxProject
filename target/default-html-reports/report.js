$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Users should be able to login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    },
    {
      "name": "@ui"
    },
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "Login as a user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    },
    {
      "name": "@ui"
    },
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enter the valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.the_user_enter_the_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Search.feature");
formatter.feature({
  "name": "Find any  film from webpage",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Searching  any film",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    },
    {
      "name": "@ui"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchStepDefs.the_user_is_on_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enter film name \"Tom hanks\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepDefs.the_user_enter_film_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/SearchResult.feature");
formatter.feature({
  "name": "movie search results",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "search results of movies",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    },
    {
      "name": "@ui"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchStepDefs.the_user_is_on_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enter film name \"Tom hanks\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchStepDefs.the_user_enter_film_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "go to movies and click on",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchResultStepDefs.go_to_movies_and_click_on()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify number of movies",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchResultStepDefs.verify_number_of_movies()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});