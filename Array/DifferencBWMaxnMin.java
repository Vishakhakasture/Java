
// Return the difference between the largest and smallest element in the array.

// Example:
// Input: [10, 5, 20, 1, 100]
// Output: 100 - 1 = 99
public class DifferencBWMaxnMin {
  public static void main(String[] args) {
    int[] arr = { 10, 5, 20, 1, 100 };
    int max = arr[0];
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      } else if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println(max - min);
  }
}
