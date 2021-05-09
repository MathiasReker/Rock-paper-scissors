package dk.reker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComputerTest {
  @Test
  public void testTakeTurn() {
    boolean result = inArray(Choice.ROCK.name(), new String[] {"ROCK", "PAPER", "SCISSORS"});

    Assertions.assertTrue(result);
  }

  @Test
  public void testTakeTurn2() {
    boolean result = inArray(Choice.ROCK.name(), new String[] {"TEST", "LAVA", "CHEAT"});

    Assertions.assertFalse(result);
  }

  @Test
  public void testGetChoice() {
    boolean result = inArray(new Computer().getChoice(), new int[] {1, 2, 3});

    Assertions.assertTrue(result);
  }

  @Test
  public void testGetChoice2() {
    boolean result = inArray(new Computer().getChoice(), new int[] {-1, 4, 5});

    Assertions.assertFalse(result);
  }

  private boolean inArray(String needle, String[] haystack) {
    for (String i : haystack) {
      if (i.equals(needle)) {
        return true;
      }
    }

    return false;
  }

  private boolean inArray(int needle, int[] haystack) {
    for (int i : haystack) {
      if (i == needle) {
        return true;
      }
    }

    return false;
  }
}
