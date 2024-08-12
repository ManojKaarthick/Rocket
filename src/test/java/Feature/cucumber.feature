Feature: Automating the demo blaze site


 Scenario Outline: Validating the login credentials

   Given user  launches url and user is on home page
   And user clicking the login button
   When  user entering the valid "<username>"
   And user entering valid "<password>"
   Then user clicking  the signin button
   @Tc2
   Examples:
     | username | password |
     |mailformanojkaarthick@gmail.com|Manoj@638003|
     |manoj@gmail.com                |Manoj@638003|
   @Tc1
   Examples:
   |username|password|
   |mailformanojkaarthick@gmail.com|Manoj@638003|











