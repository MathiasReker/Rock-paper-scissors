package dk.reker;

import java.util.Random;

class Computer implements Player {
  @Override
  public Choice takeTurn() {
    return Choice.valueOf(getChoice());
  }

  /**
   * Returns a random number between 1 and 3.
   *
   * @return int
   */
  int getChoice() {
    return new Random().nextInt(3) + 1;
  }
}
