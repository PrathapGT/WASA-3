#Author:prathap
#Feature:Login

Feature: LOGIN feature
  

  
  Scenario: Login To Vtiger application using valid credentials
    Given I want to launch the browser
    And I want to load the url
    When Login page is displayed enter valid credentials
    And click on Login
    Then validate if Hommepage is displayed
    
