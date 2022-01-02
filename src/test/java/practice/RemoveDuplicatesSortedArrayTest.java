package practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesSortedArrayTest {

  RemoveDuplicatesSortedArray rdsa;

  @BeforeEach
  public void init() {
    this.rdsa = new RemoveDuplicatesSortedArray();
  }

  @Test
  public void Test1() {
    int[] input = {0,0,1,1,1,2,2,3,3,4};
    int expected_num = 5;
    int[] expected_arr = new int[input.length];
    expected_arr[0] = 0;
    expected_arr[1] = 1;
    expected_arr[2] = 2;
    expected_arr[3] = 3;
    expected_arr[4] = 4;

    assertAll("check output",
        () -> assertEquals(expected_num, rdsa.removeDuplicates(input)),
        () -> assertEquals(expected_arr, input)
    );
  }
}