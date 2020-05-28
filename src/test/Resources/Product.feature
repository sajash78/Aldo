Feature:
  Background:
    Given user is on the home page of aldo
    When user brings the mouse cursor onto men and click on sub elemennt-loafers
    Then user should be able to see the result page.


    Given user in on page of the loafer
    When user clicks on price(high to low)
    Then user should able to see all products by the order of prices (high to low)

    Scenario:
      Given user is on result page of loafer with the price (high to low) order
      When user clicks on the product Drorelian
      Then user should be able to see product Drorelian  'add to bag' page
