Feature:

  Scenario: -As an Admin user I should be able to see all the required elements displayed,when I navigate to the User Management page
    Given I login as an Admin
    When I navigate to Admin User Management page.
    And I click on Add button
    Then I verify that all the required elements are displayed (User Role, Employee Name,Status, Username, Password, Confirm Password, Cancel, Save)


    Scenario: TestCase_9
      Given I open url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
      When I type "Admin" into element with xpath "//input[@name='username']"
      And I type "admin123" into element with xpath "//input[@type='password']"
      And I click on element with xpath "//button[@type='submit']"
      And I click on element with xpath "//span[text()='Admin']"
      And I click on element with xpath "//div//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"
#      Then I verify that all the required elements are displayed.

