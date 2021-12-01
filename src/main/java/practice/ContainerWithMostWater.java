package practice;

public class ContainerWithMostWater {
  public int maxArea(int[] height) {
    int max = 0;
    int tmpMax;

    for(int i = 0; i < height.length; i++){
      for (int j = i+1; j < height.length; j++) {
        if(height[i] > height[j]) {
          tmpMax = height[j] * (j-i);
        }
        else {
          tmpMax = height[i] * (j-i);
        }
        if(tmpMax > max) {
          max = tmpMax;
        }
      }
    }
    return max;
  }
}
