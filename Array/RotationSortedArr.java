// Check if Array is a Rotation of a Sorted Array

// Problem: Given an array, return true if it is a rotation of a sorted array.

// Example: [3, 4, 5, 1, 2] → Yes, it’s rotated version of [1, 2, 3, 4, 5]
public class RotationSortedArr {
  public static void main(String[] args) {
    int[] arr = { 3, 4, 5, 1, 2 };
    boolean res = false;
    int n = arr.length;
    int count = 0; // to check the drop
    for (int i = 0; i < n; i++) {
      if (arr[i] > arr[(i + 1) % n]) {
        count++;
      }
    }
    if (count > 1) {
      res = false;
    } else {
      res = true;
    }
    System.out.println(res);
  }
}
