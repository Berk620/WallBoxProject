Feature:  Post a Rating
@api
  Scenario: Movie rating for specific movie

    Given user connects to  Post url
    When user posts a rating
      |value|8|
    Then verify that the status_Code is 201


