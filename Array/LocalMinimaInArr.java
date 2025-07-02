// Definition: A local minimum is an element that is smaller than both of its neighbors.

// 📥 Input: An array of integers
// 📤 Output: Count of local minima
// Input: [9, 6, 8, 3, 7, 4, 6]
// Output: 2
// Explanation:
// - 6 is less than 9 and 8 → local min
// - 3 is less than 8 and 7 → local min
// - 4 is less than 7 and 6 → local min
// → Total = 3 local minima
public class LocalMinimaInArr {
  public static void main(String[] args) {
    int[] arr = { 9, 6, 8, 3, 7, 4, 6 };
    int localMinima = 0;
    for (int i = 1; i < arr.length - 1; i++) {
      if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
        localMinima++;
      }
    }
    System.out.println(localMinima);
  }
}
