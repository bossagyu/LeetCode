package practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

  RemoveElement removeElement;

  @BeforeEach
  public void init() {
    this.removeElement = new RemoveElement();
  }

  @Test
  public void Test1() {
    int[] input = {0,1,2,2,3,0,4,2};
    int val = 2;
    int expected_num = 5;
    int[] expected_arr = {0,1,3,0,4,0,0,0};

    assertAll("check output",
        () -> assertEquals(expected_num, removeElement.removeElementProblem(input, val)),
        () -> assertEquals(expected_arr[0], 0),
        () -> assertEquals(expected_arr[1], 1),
        () -> assertEquals(expected_arr[2], 3),
        () -> assertEquals(expected_arr[3], 0),
        () -> assertEquals(expected_arr[4], 4)
        );
  }



}