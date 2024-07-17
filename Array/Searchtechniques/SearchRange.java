package Searchtechniques;

import java.util.*;

public class SearchRange {
  public static void main(String[] args) {
    int[] arr = { 4, 5, 6, 7, 8, 9, 12, 50 };
    int target = 50;
    System.out.println("Found at index " + searchIndex(arr, target, 1, 4));
  }

  public static int searchIndex(int[] arr, int target, int start, int stop) {
    for (int i = start; i < stop; i++) {
      if (arr[i] == target) {
        return i;
      }
    }
    return -1;
  }
}
