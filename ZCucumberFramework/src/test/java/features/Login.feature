Feature: login to application

  Scenario: login to ecommerce application
    Given user browser launch
    When user enters url "https://admin-demo.nopcommerce.com/login"
    When user enters login creditioanls as below
      | sr.no | email               | passoword |
      |    01 | admin@yourstore.com | admin     |
      |    02 | abc@gmail.com        | xyz123    |
    When user click on login
    Then validate user successfuly logged in application
Scenario: Default status of chek box    
Given user browser launch
When user enters url "https://admin-demo.nopcommerce.com/login"
Then validate remember checkbox status