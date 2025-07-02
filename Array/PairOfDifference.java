// Problem:
// Given a sorted array and a number k, check if there exists a pair with absolute difference equal to k.
// Input: arr = [1, 3, 5, 8, 10], k = 2
// Output: true (because 3 and 1 have difference 2)

// Hint: Use two pointers i and j where j > i.

public class PairOfDifference {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 5, 8, 10 };
    int k = 2;

    // O(n^2)
    boolean res = false;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (Math.abs(arr[i] - arr[j]) == k) {
          res = true;
          break;
        }
      }
    }
    System.out.println(res);

    // O(n)
    int i = 0, j = 1;
    boolean found = false;
    while (j < arr.length) {
      int diff = arr[j] - arr[i];
      if (i == j) {
        j++;
        continue;
      }
      if (diff == k) {
        found = true;
        break;
      } else if (diff < k) {
        j++;
      } else {
        i++;
      }
    }
    System.out.println(found);

  }
}
