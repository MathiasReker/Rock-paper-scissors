/** Keeps track of the score. */
class Score {
  private int gamesWonByHuman;
  private int gamesWonByComputer;
  private int gameRounds;

  void humanWins() {
    gamesWonByHuman++;
  }

  int getHumanWins() {
    return gamesWonByHuman;
  }

  void computerWins() {
    gamesWonByComputer++;
  }

  int getComputerWins() {
    return gamesWonByComputer;
  }

  void totalRounds() {
    gameRounds++;
  }

  int getTotalRounds() {
    return gameRounds;
  }
}
