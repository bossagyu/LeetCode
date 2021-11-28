package practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigzagConversionTest {
  ZigzagConversion zigzag;

  @BeforeEach
  public void init() {
    this.zigzag = new ZigzagConversion();
  }

  @Test
  public void Test1() {
    String expected = "PAHNAPLSIIGYIR";
    String inputStr = "PAYPALISHIRING";
    int inputNum = 3;

    assertEquals(expected, zigzag.convert(inputStr, inputNum));
  }

  @Test
  public void Test2() {
    String inputStr = "PAYPALISHIRING";
    String expected = "PINALSIGYAHRPI";
    int inputNum = 4;

    assertEquals(expected, zigzag.convert(inputStr, inputNum));
  }

  @Test
  public void Test3() {
    String expected = "A";
    String inputStr = "A";
    int inputNum = 1;

    assertEquals(expected, zigzag.convert(inputStr, inputNum));
  }

  @Test
  public void Test4() {
    String expected = "AB";
    String inputStr = "AB";
    int inputNum = 1;

    assertEquals(expected, zigzag.convert(inputStr, inputNum));

  }
  @Test
  public void ex1() {
    String inputStr = "PINALSIGYAHRPI";
    System.out.println(inputStr.charAt(12));
  }
}
