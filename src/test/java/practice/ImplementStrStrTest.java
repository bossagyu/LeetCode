package practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplementStrStrTest {
  ImplementStrStr implementStrStr;

  @BeforeEach
  public void init() {
    this.implementStrStr = new ImplementStrStr();
  }

  @Test
  public void Test1() {
    String haystack = "hello";
    String needle = "ll";
    int expected = 2;

    assertEquals(expected, implementStrStr.strStr(haystack, needle));
  }

  @Test
  public void Test2() {
    String haystack = "aaaaaa";
    String needle = "bba";
    int expected = -1;

    assertEquals(expected, implementStrStr.strStr(haystack, needle));
  }

  @Test
  public void Test3() {
    String haystack = "";
    String needle = "";
    int expected = 0;

    assertEquals(expected, implementStrStr.strStr(haystack, needle));
  }
}