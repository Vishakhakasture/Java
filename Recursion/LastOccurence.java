public class LastOccurence {
  public static int lastOccurence(int[] arr, int key, int i) {
    if (i == arr.length) {
      return -1;
    }
    int isFound = lastOccurence(arr, key, i + 1);
    if (isFound == -1 && arr[i] == key) {
      return i;
    }
    return isFound;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 4, 2, 8, 10, 3, 5, 4, 2, 9 };
    int key = 2;
    System.out.println(lastOccurence(arr, key, 0));
  }

}
