package practice;

public class ContainerWithMostWaterEx {
  public int maxArea(int[] height) {
    int max = 0;
    int tmpMax;
    int head = 0;
    int tail = height.length - 1;

    while(head <= tail - 1){
      if(height[head] > height[tail]) {
        tmpMax = height[tail] * (tail - head);
      }
      else {
        tmpMax = height[head] * (tail - head);
      }
      if(tmpMax > max) {
          max = tmpMax;
      }
      if(height[head] < height[tail]) {
        head++;
      }
      else {
        tail--;
      }
    }
    return max;
  }
}
