Feature: Tests Successful And failed login conditions on Autobars

Scenario: Test SUCCESSFUL login
    Given User is on the Autobars login page
    And I enter "ealing" username
    And I enter "japanesenods" password
    And I click Signin button
    Then landing page is displayed

Scenario: Test UNSUCCESSFUL login
    Given User is on the Autobars login page
    And I enter "ealing" username
    And I enter "japanesenods2" password
    And I click Signin button
    Then Login page is displayed
       # And the error message title should be "Login Failed"
        #And the erre message should be "Your username or password have not been recognised. Please verify them and try again."


