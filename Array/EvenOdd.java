
// Given an array of integers, count how many elements are even and how many are odd.

// Example:
// Input: [1, 2, 3, 4, 5, 6]
// Output: Even: 3, Odd: 3
public class EvenOdd {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6 };
    int even = 0, odd = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        even++;
      } else {
        odd++;
      }
    }
    System.out.println("Even " + even + " Odd " + odd);
  }

}
