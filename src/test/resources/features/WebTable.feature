Feature: Web Tables


  Scenario: Check web tables headers names and orders
    Given navigate to the homepage
    When verify that Web Table Examples headers names and order are following
      |Instructor Course Price|
  @wip
  Scenario: Check sum of Amount column
    Given navigate to the homepage
    When sum the Amount Column
    Then It should be same with the amount of Total Amount Collected

