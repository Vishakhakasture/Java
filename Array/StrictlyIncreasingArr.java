// Check If Array Is Strictly Increasing
// Problem:
// Return true if the array is strictly increasing (each number is greater than the previous), else return false.

// Example:
// Input: [1, 2, 3, 4] → Output: true
// Input: [1, 2, 2, 3] → Output: false (not strictly increasing)
public class StrictlyIncreasingArr {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4 };
    boolean res = true;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] <= arr[i - 1]) {
        res = false;
        break;
      }
    }
    System.out.println(res);
  }
}
