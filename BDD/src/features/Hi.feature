
Feature: Login into facebook
  

  Scenario: login with valid cred's
  
    Given User is on facebook  login page 
    When I entered the valid credntionals
    Then I was able to see the facebook login page

