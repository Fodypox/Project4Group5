Feature:
  Scenario: Verify that ESS user name is added on the list
    Given I login as an Admin
    When I navigate to Admin page
    And I click on Add button
    And I fill up the form by entering the required info to the all input boxes
    And I click on Save button
    Then I verify that ESS – user name is added on the list