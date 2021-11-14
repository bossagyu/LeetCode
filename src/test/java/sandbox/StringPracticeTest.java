package sandbox;

import org.junit.jupiter.api.Test;
import practice.Sample;

import static org.junit.jupiter.api.Assertions.*;

class StringPracticeTest {
  @Test
  public void test1() {
    StringPractice stringPractice = new StringPractice();
    stringPractice.practice1();
  }
  @Test
  public void test2(){
    String str = "abcde";

    for(char c : str.toCharArray()) {
      System.out.println(String.valueOf(c));
      System.out.println();
    }
  }

}