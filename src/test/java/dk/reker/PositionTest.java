package dk.reker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PositionTest {
  @Test
  public void testValues() {
    Assertions.assertArrayEquals(new String[] {Position.PLAYER.name()}, new String[] {"PLAYER"});
  }

  @Test
  public void testValues2() {
    Assertions.assertArrayEquals(
        new String[] {Position.COMPUTER.name()}, new String[] {"COMPUTER"});
  }

  @Test
  public void testValues3() {
    Assertions.assertArrayEquals(new String[] {Position.TIE.name()}, new String[] {"TIE"});
  }
}
