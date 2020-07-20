Feature: movie search results

  @wip @ui
  Scenario: search results of movies
    Given the user is on the main page
    And  the user enter film name "Tom hanks"
    Then  go to movies and click on
    Then verify number of movies