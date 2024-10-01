Feature: post register

  @PostRegister
  Scenario Outline: post register successfully.
    When I consume the endpoint, I send the information
    Then I can validate the answer service <code>

    Examples:
      | code |  |
      | 200  |  |