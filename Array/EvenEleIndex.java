public class EvenEleIndex {
  public static void main(String args[]) {
    int[] arr = { 10, 20, 15, 11, 99, 44, 80 };
    for (int i = 0; i < arr.length; i++) {
      if (i % 2 == 0) {
        System.out.println(arr[i]);
      }
    }
  }
}
