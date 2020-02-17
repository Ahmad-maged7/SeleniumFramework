Feature: User Registration
the user shoulb be able to register successfully

Scenario Outline: User Can Register
Given the user is in the homepage
When click the register link
And the user enters <firstName>,<lastName>,<email>, <pass>
Then user should register successfully

Examples:
| firstName | lastName | email | pass |
| test123 | tester | ttTesterqwe@test.com | 87654321|
| test1234 | testerr | ttTesterqwer@test.com | 876543210|


