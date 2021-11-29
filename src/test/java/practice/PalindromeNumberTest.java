package practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {
  PalindromeNumber palindromeNumber;

  @BeforeEach
  public void init(){
    this.palindromeNumber = new PalindromeNumber();
  }
  @Test
  public void Test1(){
    int inputNum = 121;
    Boolean expected = true;
    assertEquals(expected, palindromeNumber.isPalindrome(inputNum));
  }

  @Test
  public void Test2(){
    int inputNum = -121;
    Boolean expected = false;
    assertEquals(expected, palindromeNumber.isPalindrome(inputNum));
  }

  @Test
  public void Test3(){
    int inputNum = 10;
    Boolean expected = false;
    assertEquals(expected, palindromeNumber.isPalindrome(inputNum));
  }

}