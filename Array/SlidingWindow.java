public class SlidingWindow {
  public static int maxSum(int[] arr, int k) {
    int c_sum = 0;
    int max_sum = 0;
    // first window, sum
    for (int i = 0; i < k; i++) {
      c_sum = arr[i] + c_sum;
    }
    // maxsum
    for (int i = k; i < arr.length; i++) {
      c_sum = c_sum - arr[i - k] + arr[i];
      System.out.println(c_sum);
      max_sum = Math.max(max_sum, c_sum);
    }
    return max_sum;
  }

  public static void main(String[] args) {
    int[] arr = { 10, -9, 0, -2, 15, -6, 25, -8 };
    int k = 3;
    int maxsum = maxSum(arr, k);
    System.out.println(maxsum);
  }
}
