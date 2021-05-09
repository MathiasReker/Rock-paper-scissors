package dk.reker;

/** Keeps track of the score. */
class Score {
  private int gamesWonByHuman;
  private int gamesWonByComputer;
  private int gameRounds;

  /** Add one win to the human. */
  void setHumanWins() {
    gamesWonByHuman++;
  }

  /**
   * Returns the amount of matches won by the human.
   *
   * @return int
   */
  int getHumanWins() {
    return gamesWonByHuman;
  }

  /** Add one win to the computer. */
  void setComputerWins() {
    gamesWonByComputer++;
  }

  /**
   * Returns the amount of matches won by the computer.
   *
   * @return int
   */
  int getComputerWins() {
    return gamesWonByComputer;
  }

  /** Add one round of played matches. */
  void setTotalRounds() {
    gameRounds++;
  }

  /**
   * Returns the amount of played matches.
   *
   * @return int
   */
  int getTotalRounds() {
    return gameRounds;
  }
}
