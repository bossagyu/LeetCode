package practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {
  IntegerToRoman integerToRoman;

  @BeforeEach
  public void init() {
    this.integerToRoman = new IntegerToRoman();
  }

  @Test
  public void Test1() {
    int input = 3;
    String expected = "III";

    assertEquals(expected, integerToRoman.intToRoman(input));
  }

  @Test
  public void Test2() {
    int input = 4;
    String expected = "IV";

    assertEquals(expected, integerToRoman.intToRoman(input));
  }

  @Test
  public void Test3() {
    int input = 9;
    String expected = "IX";

    assertEquals(expected, integerToRoman.intToRoman(input));
  }

  @Test
  public void Test4() {
    int input = 58;
    String expected = "LVIII";

    assertEquals(expected, integerToRoman.intToRoman(input));
  }

  @Test
  public void Test5() {
    int input = 1994;
    String expected = "MCMXCIV";

    assertEquals(expected, integerToRoman.intToRoman(input));
  }


}