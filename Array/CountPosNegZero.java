// Count Positive, Negative, and Zero elements

// 🧠 Problem: Given an array, count how many elements are >0, <0, and ==0.

// 📥 Example: [1, -2, 0, 3, -1] → Output: Positive: 2, Negative: 2, Zeros: 1

public class CountPosNegZero {

  public static void main(String[] args) {
    int[] arr = { 1, -2, 0, 3, -1 };
    int pos = 0, neg = 0, zero = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 0) {
        pos++;
      } else if (arr[i] < 0) {
        neg++;
      } else {
        zero++;
      }
    }
    System.out.println("Positive " + pos + " Negative " + neg + " Zeros " + zero);
  }

}