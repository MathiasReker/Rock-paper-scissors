package dk.reker;

/** Outcomes that may occur. */
enum Choice {
  ROCK(1, 2),
  PAPER(2, 3),
  SCISSORS(3, 1);

  private final int ID;
  private final int WIN_BY;

  /**
   * Choice constructor set ID and WIN_BY.
   *
   * @param id int
   * @param winBy int
   */
  Choice(int id, int winBy) {
    ID = id;
    WIN_BY = winBy;
  }

  /**
   * Returns value of choice.
   *
   * @param playerChoice is the choice chosen by the player.
   * @return Choice
   */
  static Choice valueOf(int playerChoice) {
    for (Choice choice : Choice.values()) {
      if (playerChoice == choice.ID) {
        return choice;
      }
    }

    throw new IllegalArgumentException("Not a valid choice");
  }

  /**
   * Returns true if WIN_BY is equal to ID.
   *
   * @param choice Choice
   * @return boolean
   */
  boolean isWinBy(Choice choice) {
    return WIN_BY == choice.ID;
  }
}
