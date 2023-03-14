Feature:

  Scenario: As an Admin user I should be able to see notification messages displayed, when I enter different values in to the “password’ and “password confirm” fields
    Given I login as an Admin
    When I navigate to Admin User Management page.
    And I click on Add button
    And I enter a required value in to the “password” field and different value in to the “confirm password” field
    Then I verify that notification messages “Passwords do not match” in red color displayed.


  Scenario: TestCase_4
    Given I open url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When I type "Admin" into element with xpath "//input[@name='username']"
    And I type "admin123" into element with xpath "//input[@type='password']"
    And I click on element with xpath "//button[@type='submit']"
    Then element with xpath "//h6[text()='Dashboard']" should be present and error message as "no such word" if false
    Then I click on element with xpath "//span[text()='Admin']"
    Then I click on element with xpath "//div//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"
    And I type "Na123456@" into element with xpath "//div//input[@type='password'][1]"
    And I type "Na1234567" into element with xpath "//input[@type='password'])[2]"
    Then element with xpath "//span[text()='Passwords do not match']" should have text as "Passwords do not match" and error message as "The error message do not match with expected" if false
