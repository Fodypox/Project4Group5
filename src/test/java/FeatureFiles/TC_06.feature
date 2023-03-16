Feature:
  Scenario: Registration with an invalid username
    Given I open url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When I type "Admin" into element with xpath "//input[@name='username']"
    When I type "admin123" into element with xpath "//input[@type='password']"
    And I click on element with xpath "//button[@type='submit']"
    And I click on element with xpath "//span[text()='Admin']"
    And I click on element with xpath "(//button[@type='button'])[4]"
    When I type "abcd" into element with xpath "(//input[@class='oxd-input oxd-input--active'])[2]"
    Then element with xpath "//span[text()='Should be at least 5 characters']" should be displayed and error message as "Should be at least 5 characters" if false