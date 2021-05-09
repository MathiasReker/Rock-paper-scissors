package dk.reker;

/** Keeps track of the score. */
class Score {
  private int gamesWonByHuman;
  private int gamesWonByComputer;
  private int gameRounds;

  void setHumanWins() {
    gamesWonByHuman++;
  }

  int getHumanWins() {
    return gamesWonByHuman;
  }

  void setComputerWins() {
    gamesWonByComputer++;
  }

  int getComputerWins() {
    return gamesWonByComputer;
  }

  void setTotalRounds() {
    gameRounds++;
  }

  int getTotalRounds() {
    return gameRounds;
  }
}
