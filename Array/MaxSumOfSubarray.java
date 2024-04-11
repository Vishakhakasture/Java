
public class MaxSumOfSubarray {
  public static int maxSum(int[] arr, int k) {
    int maxsum = 0;
    int cursum;
    for (int i = 0; i <= arr.length - k; i++) {
      cursum = 0;
      for (int j = i; j < i + k; j++) {
        cursum = cursum + arr[j];
      }
      maxsum = Math.max(maxsum, cursum);
    }
    return maxsum;
  }

  public static void main(String args[]) {
    int[] arr = { 3, 5, 7, -2, -9, 17, 24, -12 };
    int k = 3;
    int maxsum = maxSum(arr, k);
    System.out.println(maxsum);
  }
}
