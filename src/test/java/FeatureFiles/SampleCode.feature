Feature:

  Scenario: This are the sample codes
    Given I open url "urlLink"
    When I type "text" into element with xpath "xpath"
    And I click on element with xpath "xpath"
    And I clear element with xpath "xpath"
    And I scroll to the element with xpath "{string}" with offset 100
    When I should see page title as not "{string}" and error message as "{string}" if false
    When I should see page title as "{string}" and error message as "{string}" if false
    When I should see page title contains "{string}" and error message as "{string}" if false
    When I should see page title does not contain "{string}" and error message as "{string}" if false
    When element with xpath "{string}" should be disabled and error message as "{string}" if false
    When element with xpath "{string}" should be displayed and error message as "{string}" if false
    When element with xpath "{string}" should be enabled and error message as "{string}" if false
    When element with xpath "{string}" should be present and error message as "{string}" if false
    When element with xpath "{string}" should be selected and error message as "{string}" if false
    When element with xpath "{string}" should contain text "{string}" and error message as "{string}" if false
    When element with xpath "{string}" should have text as "{string}" and error message as "{string}" if false
    When element with xpath "{string}" should not be displayed and error message as "{string}" if false
    When element with xpath "{string}" should not be present and error message as "{string}" if false
    When element with xpath "{string}" should not be selected and error message as "{string}" if false
    When element with xpath "{string}" should not contain text "{string}" and error message as "{string}" if false
    When element with xpath "{string}" should not have text as "{string}" and error message as "{string}" if false
    When I wait for 10 sec