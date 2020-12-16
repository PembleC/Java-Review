// Cucumber Parameterization
// Carson Pemble
// 12/15/2020


# Using Scenario Outlines
Feature: Title of your feature
  I want to use this template for my feature file
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step
    Examples:
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |

# Example 2
Feature: To check the Edit Profile  functionality for each user
  Scenario Outline: Successful login with valid credentials
    Given user is on PackAndGo login page
    When user enters the "<username>" and "<password>" credentials
    Then user logged in and checks for Edit Profile
    And user logout from application
    Examples:
      | username  | password  |
      | pgAlmacho | freezeray |
      | pgScarlet | freezeray |


# Using Data Table
Feature: Login functionality check for an application
  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters Credentials to LogIn
      | testuser_1 | Test@153 |
    Then Message displayed Login Successfully
