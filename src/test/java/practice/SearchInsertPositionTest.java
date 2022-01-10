package practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {
  SearchInsertPosition searchInsertPosition;

  @BeforeEach
  public void init() {
    this.searchInsertPosition = new SearchInsertPosition();
  }

  @Test
  public void Test1() {
    int[] nums = {1, 3, 5, 6};
    int target = 5;
    int expected = 2;

    assertEquals(expected, searchInsertPosition.searchInsert(nums, target));
  }

}