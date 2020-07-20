$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/GetMovie.feature");
formatter.feature({
  "name": "Get Movie",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User Get a  Movie",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@api"
    }
  ]
});
formatter.step({
  "name": "user connects to  www.themoviedb.org url",
  "keyword": "Given "
});
formatter.match({
  "location": "GetAPIStepDefs.user_connects_to_www_themoviedb_org_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets response",
  "keyword": "When "
});
formatter.match({
  "location": "GetAPIStepDefs.user_gets_response()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that the statusCode is 200",
  "keyword": "Then "
});
formatter.match({
  "location": "GetAPIStepDefs.verify_the_statusCode_is(Object)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that the contentType is \"application/json;charset\u003dutf-8\"",
  "keyword": "Then "
});
formatter.match({
  "location": "GetAPIStepDefs.verify_the_contentType_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that ten pages has 200 top-rated movies",
  "keyword": "Then "
});
formatter.match({
  "location": "GetAPIStepDefs.verify_that_ten_pages_has_top_rated_movies(Object)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/PostMovieRate.feature");
formatter.feature({
  "name": "Post a Rating",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Movie rating for specific movie",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@api"
    }
  ]
});
formatter.step({
  "name": "user connects to  Post url",
  "keyword": "Given "
});
formatter.match({
  "location": "PostAPIStepDefs.user_connects_to_https_api_themoviedb_org_movie_rating_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user posts a rating",
  "rows": [
    {
      "cells": [
        "value",
        "8"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "PostAPIStepDefs.user_posts_a_rating(String,Integer\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that the status_Code is 201",
  "keyword": "Then "
});
formatter.match({
  "location": "PostAPIStepDefs.verify_that_the_status_Code_is(Object)"
});
formatter.result({
  "status": "passed"
});
});