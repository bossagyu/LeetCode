package practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {
  RomanToInteger romanToInteger;

  @BeforeEach
  public void init() {
    this.romanToInteger = new RomanToInteger();
  }

  @Test
  public void Test1(){
    String input = "III";
    int expected = 3;

    assertEquals(expected, romanToInteger.romanToInt(input));
  }

  @Test
  public void Test2(){
    String input = "IV";
    int expected = 4;

    assertEquals(expected, romanToInteger.romanToInt(input));
  }

  @Test
  public void Test3(){
    String input = "IX";
    int expected = 9;

    assertEquals(expected, romanToInteger.romanToInt(input));
  }

  @Test
  public void Test4(){
    String input = "LVIII";
    int expected = 58;

    assertEquals(expected, romanToInteger.romanToInt(input));
  }

  @Test
  public void Test5(){
    String input = "MCMXCIV";
    int expected = 1994;

    assertEquals(expected, romanToInteger.romanToInt(input));
  }


}