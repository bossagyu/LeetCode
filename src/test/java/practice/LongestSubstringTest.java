package practice;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringTest {
  private LongestSubstring longestSubstring;

  @BeforeEach
   void init(){
    this.longestSubstring = new LongestSubstring();
  }


  @Test
  public void Test1(){
    String s = "abcabcb";
    int expect = 3;
    assertEquals(expect, longestSubstring.lengthOfLongestSubstring(s));
  }

  @Test
  public void Test2(){
    String s = "bbbbb";
    int expect = 1;
    assertEquals(expect, longestSubstring.lengthOfLongestSubstring(s));
  }

  @Test
  public void Test3() {
    String s = "pwwkew";
    int expect = 3;
    assertEquals(expect, longestSubstring.lengthOfLongestSubstring(s));
  }

  @Test
  public void Test4() {
    String s = "aab";
    int expect = 2;
    assertEquals(expect, longestSubstring.lengthOfLongestSubstring(s));
  }

  @Test
  public void Test5() {
    String s = "";
    int expect = 0;
    assertEquals(expect, longestSubstring.lengthOfLongestSubstring(s));
  }

  @Test
  public void Test6() {
    String s = "dvdf";
    int expect = 3;
    assertEquals(expect, longestSubstring.lengthOfLongestSubstring(s));
  }

  @Test
  public void Test7() {
    String s = "aabaabcbb";
    int expect = 3;
    assertEquals(expect, longestSubstring.lengthOfLongestSubstring(s));
  }
}