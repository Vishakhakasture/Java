public class MaxElement {
  public static void main(String args[]) {
    int[] arr = { 5, 20, 10, 15, 90, 1000 };
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println("Maximum of array is: " + max);
  }
}
