Feature: get list user

  @GetListUser
  Scenario Outline: get list user successfully.
    When I consume the endpoint "<endpoint>"
    Then I can validate the answer service <code>

    Examples:
      |  | endpoint          | code |
      |  | /api/users?page=2 | 200  |