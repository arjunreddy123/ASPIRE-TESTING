Feature: login to application with multiple users

  Scenario Outline: login to ecommerce application
    Given user browser launch
    When user enters url "https://admin-demo.nopcommerce.com/login"
    When user enters login creditioanls as '<email>' and '<password>'
    When user click on login
    Then validate user successfuly logged in application

    Examples: 
      | email               | passoword |
      | admin@yourstore.com | admin     |
      | abc@gmail.com       | xyz123    |
