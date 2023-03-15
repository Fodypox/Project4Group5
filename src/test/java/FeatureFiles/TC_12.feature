Feature:
  Scenario: I login as an Admin
    Given I open url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When I type "Admin" into element with xpath "//input[@name='username']"
    And I type "admin123" into element with xpath "//input[@type='password']"
    And I click on element with xpath "//button[@type='submit']"
    And I click on element with xpath "//span[text()='Admin']"
    And I click on element with xpath "//i[@class='oxd-icon bi-plus oxd-button-icon']"
    When I type "ABCD123!!" into element with xpath "//input[@type='password']"
    Then element with xpath "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/span" should have text as "Your password must contain a lower-case letter, an upper-case letter, a digit and a special character. Try a different password" and error message as "Test is failed" if false
