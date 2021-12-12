package practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumClosestCalcTest {

  ThreeSumClosestCalc threeSumClosestCalc;

  @BeforeEach
  public void init() {
    this.threeSumClosestCalc = new ThreeSumClosestCalc();
  }

  @Test
  public void Test1() {
    int[] input = {-1,2,1,-4};
    int target = 1;
    int expected = 2;

    assertEquals(expected, threeSumClosestCalc.threeSumClosest(input, target));
  }

  @Test
  public void Test2() {
    int[] input = {0, 0, 0};
    int target = 1;
    int expected = 0;

    assertEquals(expected, threeSumClosestCalc.threeSumClosest(input, target));
  }

  @Test
  public void Test3() {
    int[] input = {0,2,1,-3};
    int target = 1;
    int expected = 0;

    assertEquals(expected, threeSumClosestCalc.threeSumClosest(input, target));
  }

}