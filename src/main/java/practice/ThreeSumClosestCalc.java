package practice;

import java.util.Arrays;

public class ThreeSumClosestCalc {
  public int threeSumClosest(int[] nums, int target) {
    int ans = 0;
    boolean isFirst = true;

    Arrays.sort(nums);
    for(int i = 0; i < nums.length-2; i++) {
      int left = i + 1;
      int right = nums.length - 1;

      while (left < right){
        int sum = nums[i] + nums[left] + nums[right];
        if(isFirst) {
          ans = sum;
          isFirst = false;
        }
        if(sum == target) {
          return sum;
        }
        if(sum > target) {
          if(Math.abs(target - ans) > Math.abs(target - sum)) {
            ans = sum;
          }
          right--;
        }
        if(sum < target) {
          if(Math.abs(target - ans) > Math.abs(target - sum)) {
            ans = sum;
          }
          left++;
        }
      }
    }
    return ans;
  }
}
