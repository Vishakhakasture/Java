// Count How Many Numbers Are Perfect Squares
// 🔸 Problem:
// Given an array, return how many elements are perfect squares.
// 📥 Example: arr = [1, 4, 3, 16, 10] → Output: 3 (1, 4, 16)

public class PerfectSquareCount {
  public static void main(String[] args) {
    int[] arr = { 1, 4, 3, 16, 10 };
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      double sqrt = Math.sqrt(arr[i]);
      if (sqrt == (int) sqrt) {
        count++;
      }
    }
    System.out.println(count);
  }
}
