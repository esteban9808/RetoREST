Feature: post create

  @PostCreate
  Scenario Outline: post create successfully.
    When t I consume the endpoint, I send the information
    Then I can validate the answer service <code>

    Examples:
      | code |  |
      | 201  |  |