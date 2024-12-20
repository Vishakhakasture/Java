public class FirstOccurence {
  public static int firstOccurence(int[] arr, int key, int i) {
    if (i == arr.length) {
      return -1;
    }
    if (arr[i] == key) {
      return i;
    }
    return firstOccurence(arr, key, i + 1);
  }

  public static void main(String[] args) {
    int[] arr = { 1, 4, 6, 8, 10, 3, 5, 4, 2, 9 };
    int key = 9;
    System.out.println(firstOccurence(arr, key, 0));
  }
}
