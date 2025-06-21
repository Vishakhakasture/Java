// In this example how 1,1 is pair returned means if with self then why not 4 and 6 Print All Pairs With Even Sum
// Problem:
// Print all pairs of elements from the array whose sum is even.

// Example:
// Input: [1, 2, 3, 4]
// Output: (2, 4) (1, 3) (1, 1) etc.

public class CountsEvenSumPairs {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4 };
    // for even sum pairs
    // O(n^2)
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if ((arr[i] + arr[j]) % 2 == 0) {
          System.out.println("(" + arr[i] + ", " + arr[j] + ")");
        }
      }
    }
    // for sum odd pairs
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if ((arr[i] + arr[j]) % 2 == 1) {
          System.out.println("(" + arr[i] + ", " + arr[j] + ")");
        }
      }
    }
  }
}
