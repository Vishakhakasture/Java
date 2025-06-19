
// Return true if the array reads the same forward and backward.

// Example:
// Input: [1, 2, 3, 2, 1]
// Output: true
// Input: [1, 2, 3, 4]
// Output: false
public class PalindromeArr {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 2, 1 };
    boolean res = true;
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
      if (arr[start] != arr[end]) {
        res = false;
        break;
      }
      start++;
      end--;
    }
    System.out.println(res);
  }
}
