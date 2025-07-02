// Find How Many Elements Are at Their Correct Index
// 🔸 Problem:
// An element is at its correct index if arr[i] == i. Return count.
// 📥 Example:
// arr = [0, 2, 2, 3, 5] → Output: 2 (0 at index 0, 3 at index 3)
public class ElementsCorrectIndex {
  public static void main(String[] args) {
    int[] arr = { 0, 2, 2, 3, 5 };
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == i) {
        count++;
      }
    }
    System.out.println(count);
  }
}
