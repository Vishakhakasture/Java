package Searchtechniques;

import java.util.Scanner;

// time complexity - O(log n)

public class BinarySearch {
  public static int binarySearh(int[] arr, int key) {
    int start = 0;
    int end = arr.length - 1;
    int mid;
    while (start <= end) {
      // mid = (start + end) / 2; if these are very large value
      mid = start + (end - start) / 2; // easy for large values
      // System.err.println(mid);
      if (key < arr[mid]) {
        end = mid - 1;
      }
      // else if (key < arr[mid]) {
      else if (key > arr[mid]) {
        start = mid + 1;
      } else {
        return mid;
      }

    }
    return -1;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
    // for desending order
    // int[] arr1 = { 100, 90, 80, 70, 60, 50, 40, 30, 20, 10 };
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
