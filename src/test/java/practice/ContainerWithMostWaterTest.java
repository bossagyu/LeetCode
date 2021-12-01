package practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {
  ContainerWithMostWater container;

  @BeforeEach
  public void init() {
    this.container = new ContainerWithMostWater();
  }

  @Test
  public void Test1() {
    int[] input = {1,8,6,2,5,4,8,3,7};
    int expected = 49;

    assertEquals(expected, container.maxArea(input));
  }

  @Test
  public void Test2() {
    int[] input = {1,1};
    int expected = 1;

    assertEquals(expected, container.maxArea(input));
  }

  @Test
  public void Test3() {
    int[] input = {4,3,2,1,4};
    int expected = 16;

    assertEquals(expected, container.maxArea(input));
  }

  @Test
  public void Test4() {
    int[] input = {1,2,1};
    int expected = 2;

    assertEquals(expected, container.maxArea(input));
  }

}