
// Return the sum of all elements located at even indexes (i.e., 0, 2, 4...)

// Example:
// Input: [5, 10, 15, 20, 25]
// Even indexes = 5 + 15 + 25 = 45
// Output: 45
public class EvenSum {
  public static void main(String[] args) {
    int[] arr = { 5, 10, 15, 20, 25 };
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      if (i % 2 == 0) {
        sum += arr[i];
      }
    }
    System.out.println(sum);
  }
}
