
@tag
Feature: To check demoqa application
 

  @tag1
  Scenario: To check registeration form
    Given User launch demoqa application
    And check the url
    When User enter the required details
    And User enter the password
    And User click Submit
    Then User close the browser
   


