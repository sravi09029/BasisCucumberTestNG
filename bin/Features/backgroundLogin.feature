Feature: Login to Production
  
  In order to perform successful login to production
  As a user
  I want to enter correct username and passowrd

  Background: 
    Given user open the browser
    When user navigates url
    And user clicks MyAccount

  Scenario: In order to verify login to production
    And user entered "valid" username
    And user entered "valid" password
    And user clicks login button
    And user validates the captch image
    Then user "shouldbe" successfully logged in

  Scenario: In order to verify login to production
    And user entered "invalid" username
    And user entered "invalid" password
    And user clicks login button
    And user validates the captch image
    Then user "shouldnot" successfully logged in
