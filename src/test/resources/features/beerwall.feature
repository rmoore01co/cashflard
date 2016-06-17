Feature: Updating the beer wall with different beers
  Scenario: On a wall with several different beer brands,
  similar beers should remain grouped together.

    Given a wall that looks like this
      | Amstel    | Busch     | Coors     |
      | Coors     | Erdinger  | Erdinger  |
      | Foster’s  | Foster’s  | Foster’s  |
    When I take a Coors down
    Then the wall should look like this
      | Amstel    | Busch     | Coors     |
      | Coors     | Erdinger  | Erdinger  |
      | Foster’s  | Foster’s  | Foster’s  |

