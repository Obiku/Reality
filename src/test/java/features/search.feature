Feature: search and place order for vegatables

Scenario: search for items and validate result
Given User is on greenkart landing page
When User search for "Cucumber" vegetables
Then "Cucumber" result are displayed