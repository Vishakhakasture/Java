// Find the Smallest Positive Number
// Problem:
// Given an array of integers, return the smallest positive number (greater than 0).

// Example:
// Input: [3, -2, 5, 0, -7, 1]
// Output: 1
public class SmallestPosInteger {
  public static void main(String[] args) {
    int[] arr = { 3, -2, 5, 0, -7, 1 };
    int small = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < small && arr[i] > 0) {
        small = arr[i];
      }
    }
    if (small == Integer.MAX_VALUE) {
      System.out.println("No positive numbers in array.");
    } else {
      System.out.println(small);
    }

  }
}
