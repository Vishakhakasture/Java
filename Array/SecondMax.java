public class SecondMax {
  public static void main(String args[]) {
    int[] arr = { 10, 20, 100, 500, 1001, 1001 };
    int max1 = arr[0];
    int max2 = arr[1];
    if (arr[0] > arr[1]) {
      max1 = arr[0];
      max2 = arr[1];
    } else {
      max1 = arr[1];
      max2 = arr[0];
    }
    for (int i = 2; i < arr.length; i++) {
      if (arr[i] > max1) {
        max2 = max1;
        max1 = arr[i];
      } else if (arr[i] > max2 && arr[i] != max1) {
        max2 = arr[i];
      }
    }
    System.out.println("max 1 is " + max1);
    System.out.println("max 2 is " + max2);
  }
}
