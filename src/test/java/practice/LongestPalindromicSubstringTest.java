package practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {
  @Test
  public void Test1() {
    LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
    String input = "babad";
    String expect = "bab";
    assertEquals(expect, lps.longestPalindrome(input));
  }

  @Test
  public void Test2(){
    LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
    String input = "cbbd";
    String expect = "bb";
    assertEquals(expect, lps.longestPalindrome(input));
  }

  @Test
  public void Test3(){
    LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
    String input = "a";
    String expect = "a";
    assertEquals(expect, lps.longestPalindrome(input));
  }

  @Test
  public void Test4(){
    LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
    String input = "ac";
    String expect = "a";
    assertEquals(expect, lps.longestPalindrome(input));
  }



  @Test
  public void Sandbox1() {
    String str = "abcd";
    StringBuilder sb = new StringBuilder();

    sb.append(str);
    sb.reverse();
    System.out.println(sb.toString());
  }

}