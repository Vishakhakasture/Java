package Searchtechniques;

import java.util.Scanner;

public class BinarySearch {
  public static int binarySearh(int[] arr, int key) {
    int start = 0;
    int end = arr.length - 1;
    int mid;
    while (start <= end) {
      mid = (start + end) / 2;
      if (key == arr[mid]) {
        return mid;
      } else if (key > arr[mid]) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }

    }
    return -1;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
    System.out.println("Enter an element to search: ");
    int key = sc.nextInt();
    int ind = binarySearh(arr, key);
    if (ind == -1) {
      System.out.println("Element not present !");
    } else {
      System.out.println("Element found at " + ind + " index");
    }
  }
}
