package SortingTechnique;

import java.util.*;

public class BubbleSort {
  public static int[] bubbleSort(int[] arr) {
    int temp = arr[0];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 1; j < arr.length-i; j++) {
        if (arr[j - 1] > arr[j]) {
          temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
        }
      }
    }
    return arr;
  }

  public static void main(String args[]) {
    int[] arr = { 90, 60, 45, 50, 100, 5, 15 };
    int[] ans = bubbleSort(arr);
    System.out.println(Arrays.toString(ans));
  }
}




