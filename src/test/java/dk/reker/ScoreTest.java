package dk.reker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ScoreTest {
  Score score = new Score();

  @Test
  void testSetHumanWins() {
    for (int i = 0; i < 3; i++) {
      score.setHumanWins();
    }

    Assertions.assertEquals(3, score.getHumanWins());
  }

  @Test
  void testSetComputerWins() {
    for (int i = 0; i < 3; i++) {
      score.setComputerWins();
    }

    Assertions.assertEquals(3, score.getComputerWins());
  }

  @Test
  void testSetTotalRounds() {
    for (int i = 0; i < 3; i++) {
      score.setTotalRounds();
    }

    Assertions.assertEquals(3, score.getTotalRounds());
  }
}
