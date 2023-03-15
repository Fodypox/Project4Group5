Feature:
  Scenario: Test case 08

    Given I open url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When I type "Admin" into element with xpath "//input[@name='username']"
    When I type "admin123" into element with xpath "//input[@type='password']"
    And I click on element with xpath "//button[@type='submit']"
    When I wait for 3 sec
    And I click on element with xpath "//span[text()='Admin']"
    When I wait for 5 sec
    Then  element with xpath "//*[@class='oxd-icon bi-plus oxd-button-icon']" should be displayed and error message as "Test is failed" if false
