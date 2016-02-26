Feature: Tests Welcome page

  Background:
    Given User is on the Autobars login page
    And I enter "ealing" username
    And I enter "japanesenods" password
    And I click Signin button
    Then landing page is displayed

Scenario: I should be able to see logout button on welcome page
    Then logout button should be displayed


Scenario: I should be able to see and click Council Tax link on welcome page

Scenario: I should be able to see NDR on welcome page

Scenario: I should get welcome message and icon for respective council


