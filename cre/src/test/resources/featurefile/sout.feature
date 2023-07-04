Feature: Open Google
Scenario: sys out
Given user is entering google
When user is typing "Dinesh Kumar"
And enters return Key
Then the user should see search results