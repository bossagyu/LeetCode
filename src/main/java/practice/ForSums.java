package practice;

import java.util.*;

public class ForSums {
  public List<List<Integer>> fourSum(int[] nums, int target) {
    if(nums.length == 0) {
      return Collections.emptyList();
    }
    Set<List<Integer>> ans = new HashSet<>();

    Arrays.sort(nums);
    for(int i = 0; i < nums.length - 3; i++){
      for(int j = i + 1; j < nums.length - 2; j++) {
        int left = j + 1;
        int right = nums.length - 1;

        while(left < right) {
          int sum = nums[i] + nums[j] + nums[left] + nums[right];
          if(sum == target) {
            ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
            left++;
            right--;
          }
          else if(sum > target) {
            right--;
          }
          else {
            left++;
          }
        }
      }
    }
    return new ArrayList<>(ans);
  }
}
