public class BitonicValue {
  public static int bitonic(int[] arr) {
    int prev = 0;
    int bitInd = 0;
    for (int i = 1; i < arr.length - 1; i++) {
      if (arr[i] > arr[prev] && arr[i] > arr[i + 1]) {
        bitInd = arr[i];
        // bitInd = i;
      }
      prev++;
    }
    return bitInd;
  }

  public static void main(String[] args) {
    int[] arr = { 12, 23, 34, 45, 96, 60, 65, 74, 43, 23 };
    int bitInd = bitonic(arr);
    System.out.println(bitInd);
  }
}
