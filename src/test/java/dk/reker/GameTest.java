package dk.reker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.NoSuchElementException;

class GameTest {

  @Test
  void testCalculateResult() {
    String input = "-1";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    Assertions.assertThrows(NoSuchElementException.class, () -> new Game().calculateResult());
  }

  @Test
  void testDisplayMenu() {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    new Game().displayMenu();

    String expectedOutput = "ROCK [1], PAPER [2], SCISSORS [3]: ";

    Assertions.assertEquals(expectedOutput, outContent.toString());
  }
}
