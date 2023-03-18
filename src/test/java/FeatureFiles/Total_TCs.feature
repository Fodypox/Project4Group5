Feature: All Test Cases combined together

  Background:
    Given I login as an Admin
    When I navigate to Admin page

  Scenario: TC 1 - Creating an ESS user account
    And I click on Add button
    And I fill up the form by entering the required info to the all input boxes
    And I click on Save button
    Then I verify that ESS – user name is added on the list

  Scenario: TC 2 - Creating an ESS user account by filling only mandatory fields
    And I click on Add button
    And I fill up the form by entering the required info to the all input boxes
    And I click on Save button
    Then I verify that ESS – user name is added on the list


  Scenario: TC 3 - Verifying error message when I click on Save button without entering mandatory fields
    And I click on Add button
    And I click on Save button

  Scenario: TC 4 - Verifying error message when I enter different values in to the “password’ and “password confirm” fields
    And I click on Add button
    And I enter a required value in to the “password” field and different value in to the “confirm password” field
    Then I verify that notification messages “Passwords do not match” in red color displayed.

  Scenario: TC 5 - Verifying error message when I enter an invalid Admin name in to the Employee name field
    And I click on Add button

  Scenario: TC 6 - Verifying error message when I enter a value in to the username field which is less than 5 characters
    And I click on Add button
    When I type "abcd" into element with xpath "(//input[@class='oxd-input oxd-input--active'])[2]"
    Then element with xpath "//span[text()='Should be at least 5 characters']" should be displayed and error message as "Should be at least 5 characters" if false

  Scenario: TC 7 - Verifying error message when I enter a value in to the username field which was already taken
    And I click on Add button

  Scenario: TC 8 - Verifying an Add button is present on Admin page
    And I wait for 2 sec
    Then element with xpath "//div[@class='orangehrm-header-container']/button" should be present and error message as "Add button is missing" if false


  Scenario: TC 9 - Verifying that all the required elements displayed, when I navigate to the User Management page
    And I click on Add button
    Then I verify that all the required elements are displayed (User Role, Employee Name,Status, Username, Password, Confirm Password, Cancel, Save)

  Scenario: TC 10 - Verifying the “Add User” is displayed, when I navigate to the User Management page
    And I click on Add button
    Then element with xpath "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']" should be displayed and error message as "Header is not displayed" if false

  Scenario: TC 11 - Verifying error message when I enter a value in to the Password field which is less than 8 characters
    And I click on Add button
    And I enter a value in to the Password field which is less than characters
    Then I verify that notification messages “Should have at least characters” in red color displayed

  Scenario: TC 12 - Verifying error message when I I enter a value in to the Password field which doesn’t have lower case character
    And I click on Add button
    When I type "ABCD123!!" into element with xpath "//input[@type='password']"
    Then element with xpath "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/span" should have text as "Your password must contain a lower-case letter, an upper-case letter, a digit and a special character. Try a different password" and error message as "Test is failed" if false