package practice;

public class RemoveElement {
  public int removeElementProblem(int[] nums, int val) {
    if(nums.length == 0) {
      return 0;
    }
    int crr = 0;

    for(int i = 0; i < nums.length; i++) {
      if(nums[i] != val) {
        nums[crr] = nums[i];
        crr++;
      }
    }
    return crr;
  }
}
