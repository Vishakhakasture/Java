// Problem:
// Given an array and a key, return the first index where the key appears.
// If the element does not exist, return -1.

// Example:
// Input: arr = [2, 4, 6, 4, 8], key = 4
// Output: 1

public class FirstOccurence {
  public static int firstOccurence(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 4, 6, 4, 8 };
    int key = 4;
    int res = firstOccurence(arr, key);
    System.out.println("first occurence of given key is " + res);
  }
}
