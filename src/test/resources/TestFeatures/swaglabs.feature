Feature: Swag Labs login

  @swaglabs
  Scenario: Check Login Page
    Given User is on SwagLabs login page
    Then Check SwagLabs Login Header
    And Check SwagLabs Username Input
    And Check SwagLabs Password Input
    And Input SwagLabs Username and Password
    And Check SwagLabs Login Button is displayed
    And Click SwagLabs Login Button
    And SwagLabs Products Page is displayed
    And SwagLabs Filter Dropdown is displayed
    And Click SwagLabs Filter Dropdown
    And I wait for 1 seconds
    And SwagLabs Filter Name A to Z is displayed
    And Click SwagLabs Filter Name A to Z
    And I wait for 1 seconds
    And SwagLabs Filter Name Z to A is displayed
    And Click SwagLabs Filter Name Z to A
    And I wait for 1 seconds
    And SwagLabs Filter Price Low to High is displayed
    And Click SwagLabs Filter Price Low to High
    And I wait for 1 seconds
    And SwagLabs Filter Price High to Low is displayed
    And Click SwagLabs Filter Price High to Low
    And I wait for 1 seconds
    And I click a random Add to Cart button
    And I wait for 2 seconds






