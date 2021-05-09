import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PositionTest {
  @Test
  void testValues() {
    Assertions.assertArrayEquals(new String[] {Position.PLAYER.name()}, new String[] {"PLAYER"});
  }

  @Test
  void testValues2() {
    Assertions.assertArrayEquals(
        new String[] {Position.COMPUTER.name()}, new String[] {"COMPUTER"});
  }

  @Test
  void testValues3() {
    Assertions.assertArrayEquals(new String[] {Position.TIE.name()}, new String[] {"TIE"});
  }
}
