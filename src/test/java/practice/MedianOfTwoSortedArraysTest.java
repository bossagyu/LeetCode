package practice;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoSortedArraysTest {

  private MedianOfTwoSortedArrays motsa;

  @BeforeEach
  void beforeAll(){
    this.motsa = new MedianOfTwoSortedArrays();
  }

  @Test
  public void test1() {
    int[] a = {1, 3};
    int[] b = {2};
    double expected = 2;
    assertEquals(expected, motsa.findMedianSortedArrays(a,b));
  }

  @Test
  public void test2() {
    int[] a = {1, 2};
    int[] b = {3, 4};
    double expected = 2.5;
    assertEquals(expected, motsa.findMedianSortedArrays(a, b));
  }

  @Test
  public void test3() {
    int[] a = {0, 0};
    int[] b = {0, 0};
    double expected = 0;
    assertEquals(expected, motsa.findMedianSortedArrays(a, b));
  }

  @Test
  public void test4() {
    int[] a = {};
    int[] b = {1};
    double expected = 1;
    assertEquals(expected, motsa.findMedianSortedArrays(a, b));
  }

  @Test
  public void test5() {
    int[] a = {2};
    int[] b = {};
    double expected = 2;
    assertEquals(expected, motsa.findMedianSortedArrays(a, b));
  }


}