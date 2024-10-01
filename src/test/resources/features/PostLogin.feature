Feature: post login

  @PostLogin
  Scenario Outline: post login successfully.
    When I consume the endpoint of login, I send the information
    Then I can validate the answer service <code>

    Examples:
      | code |  |
      | 200  |  |