package Searchtechniques;

public class AgnosticBinary {

  public static int agnosticSearch(int[] arr, int key) {
    int start = 0;
    int end = arr.length - 1;
    int mid;
    boolean isasc;
    if (arr[start] < arr[end]) {
      isasc = true;
    } else {
      isasc = false;
    }
    while (start <= end) {
      mid = start + (end - start) / 2;
      System.out.println(mid);
      if (key == arr[mid]) {
        return mid;
      }
      if (isasc) {
        if (key < arr[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      } else {
        if (key > arr[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }

    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr1 = { 100, 90, 80, 70, 60 };
    int key = 100;
    int ind = agnosticSearch(arr1, key);
    if (ind == -1) {
      System.out.println("Key not found ");
    } else {
      System.out.println("Key found at index " + ind);
    }
  }
}
