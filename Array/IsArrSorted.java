// Problem:
// Given an array, return true if it is sorted in non-decreasing order, else false.

// Example:
// Input: arr = [1, 2, 2, 3, 5]
// Output: true
// Input: arr = [5, 3, 2]
// Output: false
public class IsArrSorted {
  public static boolean isSorted(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < arr[i - 1]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 2, 3, 5 };
    boolean isSort = isSorted(arr);
    System.out.println(isSort);
  }
}
