// Count Elements Greater Than Their Previous One
// 🧠 Problem:
// Given an array of integers, count how many elements are greater than the element just before them.

// 📥 Example:
// Input: [1, 3, 2, 4, 6]
// Output: 3
// (3 > 1, 4 > 2, 6 > 4)
public class CountNumsGreater {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 2, 4, 6 };
    int count = 0;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > arr[i - 1]) {
        count++;
      }
    }
    System.out.println(count);
  }
}
