package practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumCalcTest {
  ThreeSumCalc threeSumCalc;

  @BeforeEach
  public void init() {
    this.threeSumCalc = new ThreeSumCalc();
  }

  @Test
  public void Test1(){
    int[] input = {-1,0,1,2,-1,-4};
    List<List<Integer>> expedted = new ArrayList<>();
    List<Integer> list1 = new ArrayList<>();
    list1.add(-1);
    list1.add(-1);
    list1.add(2);
    expedted.add(list1);

    List<Integer> list2 = new ArrayList<>();
    list2.add(-1);
    list2.add(0);
    list2.add(1);
    expedted.add(list2);

    assertEquals(expedted, threeSumCalc.threeSum(input));


  }

}