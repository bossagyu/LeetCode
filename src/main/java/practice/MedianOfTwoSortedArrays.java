package practice;

public class MedianOfTwoSortedArrays {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int i = 0;
    int j = 0;
    int current = 0;
    int[] result = new int[nums1.length + nums2.length];
    double median = 0;

    while (i < nums1.length || j < nums2.length) {
      // num1が空の場合はnum2を追加する
      if(i >= nums1.length) {
        result[current] = nums2[j];
        j++;
        current++;
        continue;
      }

      // num2が空の場合はnum1を追加する
      if(j >= nums2.length) {
        result[current] = nums1[i];
        i++;
        current++;
        continue;
      }

      if(nums1[i] <= nums2[j]){
        result[current] = nums1[i];
        i++;
        current++;
      }
      else {
        result[current] = nums2[j];
        j++;
        current++;
      }
    }

    // 中央値を返却
    if(result.length == 0) {
      return median;
    }

    if (result.length % 2 == 0) {
      int med_num = result.length / 2;
      return (double)(result[med_num] + result[med_num - 1]) / 2;
    }
    else {
      int med_num = result.length / 2;
      return result[med_num];
    }
  }
}
