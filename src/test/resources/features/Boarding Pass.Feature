Feature: Boarding pass generation page
  As a user, I should be able to see a successful boarding pass

  Scenario: View Boarding pass
    Given I navigate to "www.homerunner.ng"
    And I click on element having xpath "//button[text()='Get Started']"
    And I switch to new window
    Then element having xpath "//span[text()='Start']" should be present
    Then User should get successful message
