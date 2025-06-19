
// Return how many elements in the array are equal to the mean of the array.

// Example:
// Input: [2, 4, 6, 4]
// Mean = (2+4+6+4)/4 = 4
// Output: 2 elements (because two 4s)
public class EqualMean {
  public static void main(String[] args) {
    int[] arr = { 2, 4, 6, 4 };
    int mean = 0;
    int n = arr.length;
    int sum = 0, count = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    mean = sum / n;
    for (int i = 0; i < n; i++) {
      if (mean == arr[i]) {
        count++;
      }
    }
    System.err.println(count);
  }
}
