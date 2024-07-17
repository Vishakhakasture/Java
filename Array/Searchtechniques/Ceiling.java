package Searchtechniques;

// smaller number in array greater than or equal to target
public class Ceiling {

  public static int ceilingNo(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;
    int mid;
    if (target > arr[arr.length - 1]) {
      return -1;
    }
    while (start <= end) {
      mid = start + (end - start) / 2;
      if (target < arr[mid]) {
        end = mid - 1;
      } else if (target > arr[mid]) {
        start = mid + 1;
      } else {
        return mid;
      }
    }
    return start;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
    int target = 15;
    int res = ceilingNo(arr, target);
    System.out.println(res);
  }
}
