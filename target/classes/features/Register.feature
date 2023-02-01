Feature:Registration functionality
Scenario: User creates an account only with mandatory fields
Given User  navigate to  Register Account Page
When User  enters the  details into below fields
|firtName|Anitha               |
|lastName|Engem                 |
|email   |engemanitha@gmil.com   |
|Telephone|0469841963            |
|password  |Fable@1325            |
|ConfirmPassword|Fable@1325        |
And User  selects Privacy Policy
And User  clicks on contionu button
Then User account should get created  successfully

Scenario: User creates an account  with all fields
Given User  navigate to  Register Account Page
When User  enters the  details into below fields
|firtName|Anitha               |
|lastName|Engem                 |
|email   |engemanitha@gmil.com   |
|Telephone|0469841963            |
|password  |Fable@1325            |
|ConfirmPassword|Fable@1325        |
And User selects Yes for Newsletter
And User  selects Privacy Policy
And User  clicks on contionu button
Then User account should get created  successfully


Scenario: User creates a duplicate account 
Given User  navigate to  Register Account Page
When User  enters the  details into below fields
|firtName|Anitha               |
|lastName|Engem                 |
|email   |engemanitha@gmil.com   |
|Telephone|0469841963            |
|password  |Fable@1325            |
|ConfirmPassword|Fable@1325        |
And User selects Yes for Newsletter
And User  selects Privacy Policy
And User  clicks on contionu button
Then User should get a warning message about duplicate emil

Scenario:User create an account with out filling any details
Given User navigates to Register Account Page
When user dont enter any details into fields
And User click on  continue button
Then User should get a warning message for every manadatory field


