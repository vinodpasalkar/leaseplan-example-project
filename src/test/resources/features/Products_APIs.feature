Feature: Search for the product

### Please use endpoint GET https://waarkoop-server.herokuapp.com/api/v1/search/test/{product} for getting the products.
### Available products: "apple", "mango", "tofu", "water"
### Prepare Positive and negative scenarios
  @APITest1
  Scenario: Get details for available products and validate the response
    When Sergey gets the details for "apple"
    Then Sergey sees the results displayed for "apple"
    When Sergey gets the details for "mango"
    Then Sergey sees the results displayed for "mango"

  @APITest2
  Scenario: Get details for unavailable products and validate the response for error
    When Sergey gets the details for "car"
    Then Sergey does not see the results
