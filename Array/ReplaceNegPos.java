// Replace All Negative Numbers With 0
// 🔸 Problem:
// Modify the array to set all negative values to 0.
// 📥 Example:
// arr = [1, -2, 3, -4] → Modified: [1, 0, 3, 0]

import java.util.Arrays;

public class ReplaceNegPos {
  public static void main(String[] args) {
    int[] arr = { 1, -2, 3, -4 };
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        arr[i] = Math.abs(arr[i]);
      }
    }
    System.out.println(Arrays.toString(arr));
  }
}
