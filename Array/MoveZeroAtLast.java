// Problem:
// Given an array, move all 0s to the end of the array, maintaining the order of non-zero elements.

// Example:
// Input: arr = [0, 1, 0, 3, 12]
// Output: arr = [1, 3, 12, 0, 0]

import java.util.Arrays;

public class MoveZeroAtLast {
  public static void main(String[] args) {
    int[] arr = { 0, 1, 0, 3, 12 };
    // first approach - using extra array
    // time complexity - O(n)
    // space complexity - O(n) because using extra array
    int[] res = new int[arr.length];
    int index = 0; // to place non zero elements

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        res[index++] = arr[i];
      }
    }
    System.out.println(Arrays.toString(res));

    // second approach - using iplace efficient
    // time complexity - O(n)
    // space complexity - O(1) because in place
    int idx = 0; // to place non zero elements
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        arr[idx++] = arr[i];
      }
    }

    while (idx < arr.length) {
      arr[idx++] = 0;
    }

    System.out.println(Arrays.toString(arr));
  }
}
