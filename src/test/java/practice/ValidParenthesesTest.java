package practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

  ValidParentheses validParentheses;

  @BeforeEach
  public void init() {
    this.validParentheses = new ValidParentheses();
  }

  @Test
  public void Test1() {
    String input = "()";
    assertTrue(validParentheses.isValid(input));
  }

  @Test
  public void Test2() {
    String input = "()[]{}";
    assertTrue(validParentheses.isValid(input));
  }

  @Test
  public void Test3() {
    String input = "(]";
    assertFalse(validParentheses.isValid(input));
  }

  @Test
  public void Test4() {
    String input = "([)]";
    assertFalse(validParentheses.isValid(input));
  }

  @Test
  public void Test5() {
    String input = "(";
    assertFalse(validParentheses.isValid(input));
  }

  @Test
  public void Test6() {
    String input = ")";
    assertFalse(validParentheses.isValid(input));
  }

  @Test
  public void Test7() {
    String input = "(){}}{";
    assertFalse(validParentheses.isValid(input));
  }
}