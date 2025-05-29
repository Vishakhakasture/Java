public class MaxElement {
  public static void main(String args[]) {
    int[] arr = { 5, 20, 10, 15, 90, 1000 };
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println("Maximum element of array is: " + max);
  }
}
