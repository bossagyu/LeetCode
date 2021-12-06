package practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {
  LongestCommonPrefix longestCommonPrefix;

  @BeforeEach
  public void init() {
    this.longestCommonPrefix = new LongestCommonPrefix();
  }

  @Test
  public void Test1() {
    String[] input  = {"flower","flow","flight"};
    String expected = "fl";

    assertEquals(expected, longestCommonPrefix.longestCommonPrefix(input));
  }

  @Test
  public void Test2() {
    String[] input  = {"dog","racecar","car"};
    String expected = "";

    assertEquals(expected, longestCommonPrefix.longestCommonPrefix(input));
  }

  @Test
  public void Test3() {
    String[] input  = {""};
    String expected = "";

    assertEquals(expected, longestCommonPrefix.longestCommonPrefix(input));
  }

  @Test
  public void Test4() {
    String[] input  = {"ab", "a"};
    String expected = "a";

    assertEquals(expected, longestCommonPrefix.longestCommonPrefix(input));
  }

}