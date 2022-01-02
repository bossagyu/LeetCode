package practice;

public class RemoveDuplicatesSortedArray {
  public int removeDuplicates(int[] nums) {
    if(nums.length == 0) {
      return 0;
    }

    int prev_num = nums[0];
    int crr = 0;
    for(int i = 1; i < nums.length; i++) {
      if(nums[i] != prev_num) {
        nums[++crr] = nums[i];
        prev_num = nums[i];
        if(i != crr) {
          nums[i] = 0;
        }
      }
      else {
        nums[i] = 0;
      }
    }
    return crr + 1;
  }
}
