package Searchtechniques;

public class InfiniteArray {
  public static int ans(int[] arr, int target) {
    // first find the range
    // first start the size with box of 2
    int start = 0;
    int end = 1;
    // condition for the target to lie in the range
    while (target > arr[end]) {
      // keep doubling further boxes
      int newStart = end + 1;
      // end = end + sizeofbox 8 * 2
      end = end + (end - start + 1) * 2;
      start = newStart;
    }
    return searchPosition(arr, target, start, end);
  }

  public static int searchPosition(int[] arr, int target, int start, int end) {
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (target < arr[mid]) {
        end = mid - 1;
      } else if (target > arr[mid]) {
        start = mid + 1;
      } else {
        return mid;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 4, 6, 8, 11, 13, 15, 18, 20, 23, 27, 28, 35, 42, 50 };
    int target = 20;
    System.out.println(ans(arr, target));
  }
}
