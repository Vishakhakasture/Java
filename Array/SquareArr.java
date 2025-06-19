// Problem:
// Given an array, replace each element with its square, in-place.

// Example:
// Input: arr = [1, -2, 3]
// Output: arr = [1, 4, 9]

import java.util.Arrays;

public class SquareArr {
  public static void main(String[] args) {
    int[] arr = { 1, -2, 3 };
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] * arr[i];
    }
    System.out.println(Arrays.toString(arr));
  }
}
