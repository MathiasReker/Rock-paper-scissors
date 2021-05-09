package dk.reker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ChoiceTest {

  @Test
  void testValueOf() {
    Choice result = Choice.valueOf(1);
    Assertions.assertEquals(Choice.ROCK, result);
  }

  @Test
  void testValueOf2() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> Choice.valueOf("TEST"));
  }

  @Test
  void testIsWinBy() {
    boolean result = Choice.ROCK.isWinBy(Choice.SCISSORS);
    Assertions.assertFalse(result);
  }

  @Test
  void testIsWinBy2() {
    boolean result = Choice.ROCK.isWinBy(Choice.ROCK);
    Assertions.assertFalse(result);
  }

  @Test
  void testIsWinBy3() {
    boolean result = Choice.ROCK.isWinBy(Choice.PAPER);
    Assertions.assertTrue(result);
  }

  @Test
  void testValues() {
    Choice[] result = Choice.values();
    Assertions.assertArrayEquals(new Choice[] {Choice.ROCK, Choice.PAPER, Choice.SCISSORS}, result);
  }
}
