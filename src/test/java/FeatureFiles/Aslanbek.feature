Feature:

  Scenario: TC 11, verify notification message for Password that is less than 8 characters
    Given I login as an Admin
    When I navigate to Admin page
    And I click on Add button
    And I enter a value in to the Password field which is less than characters
    Then I verify that notification messages “Should have at least characters” in red color displayed
    

#  As an Admin user I should be able to see notification messages displayed, when I enter a value in to the Password field which is less than 8 characters.
#  Step 1 – I login as an Admin
#  Step 2 – I navigate to Admin / User Management page.
#  Step 3 – I click on Add button
#  Step 4 – I enter a value in to the Password field which is less than 8 characters
#  Step 5 – I verify that notification messages “Should have at least 8 characters” in red color displayed.
