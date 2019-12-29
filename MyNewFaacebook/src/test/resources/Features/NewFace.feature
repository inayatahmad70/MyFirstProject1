Feature: log up on facebook

  @Test
  Scenario: input data field
    Given put url Facebook.com
    Then user should verify the title
    Then user should be able to put "shakeela" in firstname field
    Then user should be able to put "ahmad" in lastname field
    And user should be able to put "1234" number in number field
    Then user should be able to put "Imehek" in password field
    
@Test
  Scenario: drop down
    Given user should select "01""10""1984" from DOB

  @Test
  Scenario: Gender selection
    Given user should be able to click on "Male" button
@Test
  Scenario: submit
    Given user should be able to click on "Signup" botton
