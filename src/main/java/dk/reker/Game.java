package dk.reker;

class Game {
  private static final Score SCORE = new Score();
  private Choice humanChoice;
  private Choice computerChoice;

  /**
   * Start the game.
   *
   * @param args startup params.
   */
  public static void main(String[] args) {
    new Game().play();
  }

  /**
   * Run the game best out of 3, but until a winner is found. If a match is a tie, the game will
   * continue. Call methods that display the result.
   */
  private void play() {
    while (SCORE.getHumanWins() + SCORE.getComputerWins() < 3
        && Math.abs(SCORE.getComputerWins() - SCORE.getHumanWins()) < 2) {
      displayMenu();
      displayResult();
      System.out.println(); // Separate each section
    }

    displayFinalScore();
  }

  /**
   * Returns the winner of the game and update the score.
   *
   * @return Position
   */
  Position calculateResult() {
    humanChoice = new Human().takeTurn();
    computerChoice = new Computer().takeTurn();

    SCORE.setTotalRounds();

    if (computerChoice.equals(humanChoice)) {
      return Position.TIE;
    }

    if (computerChoice.isWinBy(humanChoice)) {
      SCORE.setHumanWins();
      return Position.PLAYER;
    }

    if (humanChoice.isWinBy(computerChoice)) {
      SCORE.setComputerWins();
      return Position.COMPUTER;
    }

    throw new IllegalArgumentException("Something went wrong");
  }

  /** Display a menu based on the possible choices in the console. */
  void displayMenu() {
    String[] result = new String[Choice.values().length];

    for (int i = 0; i < Choice.values().length; i++) {
      result[i] = Choice.values()[i] + " [" + (i + 1) + "]";
    }

    System.out.print(String.join(", ", result) + ": ");
  }

  /** Display the result in the console. */
  void displayResult() {
    Position position = calculateResult();

    System.out.printf("You: %s%n", humanChoice);
    System.out.printf("Computer: %s%n", computerChoice);

    if (Position.TIE.equals(position)) {
      System.out.println("Tie.");
    }

    if (Position.PLAYER.equals(position)) {
      System.out.println("You won.");
    }

    if (Position.COMPUTER.equals(position)) {
      System.out.println("You lost.");
    }
  }

  /** Display the final score in the console. */
  void displayFinalScore() {
    if (SCORE.getHumanWins() > SCORE.getComputerWins()) {
      System.out.println("You won the game!");
    } else {
      System.out.println("You lost the game!");
    }

    System.out.printf("Total rounds: %d", SCORE.getTotalRounds());
  }
}
