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

