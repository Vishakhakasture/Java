// Find the Last Occurrence of a Key
// 🔸 Problem:
// Return the last index where a given key appears. If not present, return -1.
// 📥 Example: arr = [1, 2, 3, 2, 4], key = 2 → Output: 3
public class LastOccurenceOfKey {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 2, 4 };
    int key = 2;
    int index = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        index = i;
      }
    }
    System.out.println(index);
  }
}
