// Check if All Elements Are Unique
// 🧠 Problem:
// Return true if all elements in the array are unique, else false.

// 📥 Example:
// Input: [1, 2, 3, 4] → Output: true
// Input: [1, 2, 3, 1] → Output: false

import java.util.HashSet;

public class UniqueElements {
  public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();
    int[] arr = { 1, 2, 3, 1 };
    boolean res = true;
    for (int num : arr) {
      if (set.contains(num)) {
        res = false;
        break;
      } else {
        set.add(num);
      }
    }
    System.out.println(res);
  }
}
