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
# (Comments)
#Sample Feature Definition Template
#@tag
#Feature: Title of your feature
#I want to use this template for my feature file
#
#@tag1
#Scenario: Title of your scenario
#Given I want to write a step with precondition
#And some other precondition
#When I complete action
#And some other action
#And yet another action
#Then I validate the outcomes
#And check more outcomes
#
#@tag2
#Scenario Outline: Title of your scenario outline
#Given I want to write a step with <name>
#When I check for the <value> in step
#Then I verify the <status> in step
#
#Examples:
#| name  | value | status  |
#| name1 |     5 | success |
#| name2 |     7 | Fail    |
@Login
Feature: 
   To validate Login Functionality of Facebook Application

  Background: 
    Given User is in facebook login page

  @smoke @sanity
  Scenario: 
    To validate login using invalid username and invalid password

    When User enter invalid username and invalid password
      #1D List
      #| greens124@gmail.com | greens124 | python123@gmail.com | python123 |
      #1D Map
      | username | ktp             |
      | password | ktp1234         |
      | email    | ktp12@gmail.com |
    And User click login button
    Then User should be in invalid credential page

  @smoke @regression
  Scenario: 
    To validate login using valid username and invalid password

    When User enter valid username and invalid password
      #1D List
      #| pkt | pkt123@gmail.com | pkt123 |
      #| pk  | pk123@gmail.com  | pk123  |
      #| pt  | pt123@gmail.com  | pt123  |
      #1DMap
      | Username | Email            | Password |
      | pk       | pk123@gmail.com  | pk123    |
      | pt       | pt123@gmail.com  | pt123    |
      | kts      | kts123@gmail.com | kts123   |
    And User click login button
    Then User should be in invalid credential page
  #Scenario Outline: 
     #To validate login by using different credentials
#
    #Given User is in facebook login page
    #When User have to enter "<username>" and "<password>"
    #And User click login button
    #Then User should be in invalid credential page
#
    #Examples: 
      #| username         | password |
      #| pk124@gmail.com  | pk124    |
      #| pt123@gmail.com  | pt123    |
      #| pkt123@gmail.com | pkt123   |
      #| skt121@gmail.com | skt121   |
