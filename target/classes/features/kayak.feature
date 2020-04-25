Feature: Test functionality of Price Alerts on kayak.com
  

  Scenario Outline: Price alerts should be turned on
    Given open google chrome and lunch home page
    When user fills registration form with following details <fname> <lname> <email> <password> <birthday> <gender> 
    And user clicks signup button
    Then user verifies the error <message>
    Examples:
    |fname|lname|email|password|birthday|gender|message|
    |Test|TestUser|test@testemail.com|tyjdjfdjbdbsdbbc|1-30-1999|Male|We require everyone to use the name they use in everyday life, what their friends call them, on Facebook. Learn More about our name policies.|
 		|Test|TestUser|test@testemail.com|Password123|1-30-1999|Male|Please choose a more secure password. It should be longer than 6 characters, unique to you, and difficult for others to guess.|
 