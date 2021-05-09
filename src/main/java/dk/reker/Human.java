package dk.reker;

import java.util.Scanner;

class Human implements Player {
  @Override
  public Choice takeTurn() {
    return Choice.valueOf(getChoice());
  }

  /**
   * Returns er a human choice. Get the choice from the keyboard.
   *
   * @return int
   */
  int getChoice() {
    Scanner in = new Scanner(System.in);

    return validateIntegerRange(in, 1, Choice.values().length);
  }

  /**
   * Returns valid integer
   *
   * @param in Scanner
   * @return int
   */
  private int validateInteger(Scanner in) {
    while (!in.hasNextInt()) {
      System.out.print("Not a valid choice. Please try again: ");
      in.nextLine();
    }

    return in.nextInt();
  }

  /**
   * Returns in a validate integer within a range.
   *
   * @param in Scanner
   * @param min int
   * @param max int
   * @return int
   */
  int validateIntegerRange(Scanner in, int min, int max) {
    int result = validateInteger(in);

    while (result > max || result < min) {
      System.out.print("Not a valid choice. Please try again: ");
      in.nextLine();
      result = validateInteger(in);
    }

    return result;
  }
}
