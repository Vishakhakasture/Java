// Problem:
// Given an array of integers and a number x, count how many elements are strictly greater than x.

// Example:
// Input: arr = [5, 10, 20, 1, 100], x = 10
// Output: 2
// Explanation: Only 20 and 100 are > 10

public class GreaterElements {
  public static void greaterElement(int arr[], int x) {
    // Time complexity - O(n)
    int count = 0; // to count elements greater than x
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > x) {
        count++;
      }
    }
    System.out.println("elements greater that X are " + count);
  }

  public static void main(String[] args) {
    int[] arr = { 5, 10, 20, 1, 100 };
    int x = 10;
    greaterElement(arr, x);
  }
}
