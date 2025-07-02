// Find Product of All Non-Zero Elements
// 🔸 Problem:
// Return the product of all elements except zeros.
// 📥 Example:
// arr = [1, 2, 0, 4] → Output: 1*2*4 = 8

public class ProductNonZelements {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 0, 4 };
    int product = 1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        product *= arr[i];
      }
    }
    System.out.println(product);
  }
}
