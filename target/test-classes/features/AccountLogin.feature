Feature:Login functionality
Scenario : Login with valid credentials
Given User  navigate to login page
When User enter valid email address "amotooricap9@gmail.com" into email field
And User should enter valid Password"12345"into password field
And User should click on login button
Then User should be able to login successfully

Scenario : Login with invalid credentials
Given User should  be able  navigate to login page
When User should enter invalid email address "amotooicap9@gmail.com" into email field
And User should enter invalid Password"123456"into password field
And User should click on login button
Then User should get a warning message about credentials

Scenario : Login with invalid email address
Given User should  be able  navigate to login page
When User should enter valid email address "amotooricap@gmail.com" into email field
And User should enter valid Password"12345"into password field
And User should click on login button
Then User should get a warning message about enter valid email address 

Scenario : Login with invalid  credentials
Given User should  be able  navigate to login page
When User should enter invalid email address "amotooricap@gmail.com" into email field
And User should enter invalid Password"123456"into password field
And User should click on login button
Then User should get a warning message about enter valid email address and password