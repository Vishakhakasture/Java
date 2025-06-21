// Check if Array has Duplicate Elements

// 🧠 Problem: Return true if any value appears at least twice in the array.

// 📥 Example: [1, 2, 3, 1] → Output: true

import java.util.HashSet;

public class IsDuplicateArr {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 1 };
    // brute foorce approach
    // Time complexity is O(n^2) - because used nested loops
    boolean res = false;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          res = true;
          break;
        }
      }
      if (res) {
        break;
      }
    }
    System.out.println(res);

    // optimized version of this using HashSet
    // Time complexity - O(n) Space - O(n) because we have used HashSet here
    boolean res1 = false;
    HashSet<Integer> set = new HashSet<>();
    for (int num : arr) {
      if (set.contains(num)) {
        res1 = true;
        break;
      } else {
        set.add(num);
      }
    }
    System.out.println(res1);
  }
}
