#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Test the wizard on Tailored page

  Scenario Outline: 
    Given I am on Tailored Page
    When I click on Ok button
    And I click on Headphones
    And I select "<Element>"
    And I click "<Button>"
    Then the result page is displayed

    Examples: 
      | Element                                      | Button                                     |
      | //div[@class='step-item__question']/ul/li[1] | //form/div[3]/div[2]/button/span         |
      | //div[@class='step-item__question']/ul/li[1] | //form/div[3]/div[2]/button/span         |
      | //div[@class='step-item__question']/ul/li[1] | //form/div[3]/div[2]/button/span         |
      | //div[@class='step-item__question']/ul/li[1] | //form/div[3]/div[2]/button/span         |
      | //div[@class='step-item__question']/ul/li[1] | //form/div[3]/div[2]/button/span/span[1] |
