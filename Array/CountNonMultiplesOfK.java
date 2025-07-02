// Print All Elements Except Multiples of a Number
// 🔸 Problem:
// Print all elements except those that are divisible by k.
// 📥 Example:
// arr = [2, 4, 5, 9, 10], k = 2 → Output: 5 9

public class CountNonMultiplesOfK {
  public static void main(String[] args) {
    int[] arr = { 2, 4, 5, 9, 10 };
    int k = 2;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % k != 0) {
        System.out.print(arr[i] + " ");
      }
    }
  }
}
