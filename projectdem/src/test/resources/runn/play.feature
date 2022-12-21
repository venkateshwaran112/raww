
Feature: Personal Information
@per
  Scenario: Personal Information
    Given user has to launch the application admission page
    When user has to fill the pson information in form of textbox fields
    |venkateshwaran |
    |murugesan |
    |Thangamani Nagar|
    |chennai|
    |Silicon Valley|
    |New York|
    |100345|
    |7847839842|
    |8465732456|
    |ven1243@gmail.com|
    And user has to fill the pson information in the form of dropdowns
    |3|
    |4|
    |2|
    And user has to click their required radio button
    Then click the submit button
    
    
    

 