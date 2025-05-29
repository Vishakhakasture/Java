public class MinElement {
  public static void main(String args[]) {
    int[] arr = { 5, 20, 10, 1, -9, 1000 };
    minElement(arr);
  }

  public static void minElement(int arr[]) {
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    System.out.println("Minimum element of array is: " + min);
  }
}
