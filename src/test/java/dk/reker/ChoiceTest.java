package dk.reker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChoiceTest {
  @Test
  public void testValueOf() {
    Choice result = Choice.valueOf(1);
    Assertions.assertEquals(Choice.ROCK, result);
  }

  @Test
  public void testValueOf2() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> Choice.valueOf("TEST"));
  }

  @Test
  public void testIsWinBy() {
    boolean result = Choice.ROCK.isWinBy(Choice.SCISSORS);
    Assertions.assertFalse(result);
  }

  @Test
  public void testIsWinBy2() {
    boolean result = Choice.ROCK.isWinBy(Choice.ROCK);
    Assertions.assertFalse(result);
  }

  @Test
  public void testIsWinBy3() {
    boolean result = Choice.ROCK.isWinBy(Choice.PAPER);
    Assertions.assertTrue(result);
  }

  @Test
  public void testValues() {
    Choice[] result = Choice.values();
    Assertions.assertArrayEquals(new Choice[] {Choice.ROCK, Choice.PAPER, Choice.SCISSORS}, result);
  }
}
