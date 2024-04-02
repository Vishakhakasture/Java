public class SecondMax {
  public static void main(String args[]) {
    int[] arr = { 10, 20, 100, 500, 1000 };
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];

      }
    }
  }
}
