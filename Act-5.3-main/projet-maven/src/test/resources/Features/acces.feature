
    @tag1 
Feature: Acces to the website and create To Do list
 
  Background: Verify the accessibility to the website todos
    Given browser is open
    When user put the link of the website 
    Then show homepage
 
    
  Scenario Outline: Verify that the user can create a to do list
   Given user write <entry>
   When user hits enter
   And user write <entry1>
   And user hits enter
   And user write <entry2>
   And user hits enter
   Then the element is added to the To dos list  
   
Examples: 
  |entry|entry1|entry2|
  |av|ahmedd|ahmed|
    
    

 