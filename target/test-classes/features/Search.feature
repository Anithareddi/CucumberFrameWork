Feature:Search functionality
Scenario: user search for a valid product
Given user navigates an application
When User enter valid product  "HP" into search field
And User click on search button
Then User should get valid product displayed in search results


Scenario: user search for a invalid product
Given user navigates an application
When User enter invalid product  "Honda" into search field
And User click on search button
Then User should get a message about no product matching


Scenario: user search without any product
Given user navigates an application
When User dont enter product name into search field
And User click on search button
Then User should get a message about no product matching



