Feature:

  Scenario: Validate the display of Add User Header

    Given I login as an Admin
    When I navigate to Admin User Management page.
    And I click on Add button
    Then element with xpath "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']" should be displayed and error message as "Header is not displayed" if false


  Scenario: Test Case 10

    Given I open url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When I type "Admin" into element with xpath "//input[@name='username']"
    And I type "admin123" into element with xpath "//input[@type='password']"
    And I click on element with xpath "//button[@type='submit']"
    When I click on element with xpath "//span[text()='Admin']"
    And I click on element with xpath "//div//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"
    Then element with xpath "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']" should be displayed and error message as "Header is not displayed" if false