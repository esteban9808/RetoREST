Feature: get single user

  @GetSingletUser
  Scenario Outline: get single user successfully.
    When I consume the endpointt "<endpoint>"
    Then I can validate the answer servicee <code>

    Examples:
      |  | endpoint          | code |
      |  | /api/users/2 | 200  |