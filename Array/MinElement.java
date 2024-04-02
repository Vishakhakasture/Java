public class MinElement {
  public static void main(String args[]) {
    int[] arr = { 5, 20, 10, 15, 90, 1000 };
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    System.out.println("Maximum of array is: " + min);
  }
}
