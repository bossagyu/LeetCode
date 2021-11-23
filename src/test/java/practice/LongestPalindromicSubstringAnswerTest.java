package practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringAnswerAnswerAnswerTest {
  @Test
  public void Test1() {
    LongestPalindromicSubstringAnswer lps = new LongestPalindromicSubstringAnswer();
    String input = "babad";
    String expect = "bab";
    assertEquals(expect, lps.longestPalindrome(input));
  }

  @Test
  public void Test2(){
    LongestPalindromicSubstringAnswer lps = new LongestPalindromicSubstringAnswer();
    String input = "cbbd";
    String expect = "bb";
    assertEquals(expect, lps.longestPalindrome(input));
  }

  @Test
  public void Test3(){
    LongestPalindromicSubstringAnswer lps = new LongestPalindromicSubstringAnswer();
    String input = "a";
    String expect = "a";
    assertEquals(expect, lps.longestPalindrome(input));
  }

  @Test
  public void Test4(){
    LongestPalindromicSubstringAnswer lps = new LongestPalindromicSubstringAnswer();
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

  @Test
  public void Test5(){
    LongestPalindromicSubstringAnswer lps = new LongestPalindromicSubstringAnswer();
    String input = "ccc";
    String expect = "ccc";
    assertEquals(expect, lps.longestPalindrome(input));
  }


}