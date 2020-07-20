Feature: Get Movie
  @api
  Scenario: User Get a  Movie
    Given user connects to  www.themoviedb.org url
    When user gets response
    Then  verify that the statusCode is 200
    Then  verify that the contentType is "application/json;charset=utf-8"
    Then verify that ten pages has 200 top-rated movies