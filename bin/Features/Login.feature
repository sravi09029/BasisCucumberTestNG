@Functional @prodnew
Feature: MyAccountLogin
  					
  In order to perform successful login
  As a user
  I want to enter correct username and passowrd

  Scenario Outline: check the Login functionality with valid credentials
    Given user open the browser
    When user navigates url
    And user clicks MyAccount
    And user entered "<username>" username
    And user entered "<password>" password
    And user select the age category
      | Age      | Location |
      | above 18 | India    |
      | below 18 | USA      |
    And user clicks login button
    Then user "<loginType>" successfully logged in

    Examples: 
      | username | password | loginType |
      | valid    | valid    | shouldbe  |
      | invalid  | invalid  | shouldnot |
