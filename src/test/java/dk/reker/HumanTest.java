package dk.reker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class HumanTest {
  @Test
  public void testTakeTurnRock() {
    Choice result = Choice.valueOf(1);
    Assertions.assertEquals(Choice.ROCK, result);
  }

  @Test
  public void testTakeTurnPaper() {
    Choice result = Choice.valueOf(2);
    Assertions.assertEquals(Choice.PAPER, result);
  }

  @Test
  public void testTakeTurnScissors() {
    Choice result = Choice.valueOf(3);
    Assertions.assertEquals(Choice.SCISSORS, result);
  }

  @Test
  public void testTakeTurnTrowsException() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> Choice.valueOf(4));
  }

  @Test
  public void testTakeTurnTrowsException2() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> Choice.valueOf(-1));
  }

  @Test
  public void testGetChoice() {
    String input = "2";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    int result = new Human().getChoice();
    Assertions.assertEquals(2, result);
  }

  @Test
  public void testGetChoiceThrowException() {
    String input = "Test";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    Assertions.assertThrows(NoSuchElementException.class, () -> new Human().getChoice());
  }

  @Test
  public void testGetChoiceThrowException2() {
    String input = "100";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    Assertions.assertThrows(NoSuchElementException.class, () -> new Human().getChoice());
  }
}
