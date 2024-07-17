package Searchtechniques;

import java.util.Arrays;

public class SearchIn2D {
  public static void main(String[] args) {
    int[][] arr = {
        { 2, 4, 6 },
        { 1, 3, 5, 78 },
        { 12, 14, 16, 18, 90 },
        { 8, 10 }
    };
    int target = 90;
    int[] ans = search(arr, target);
    System.out.println(Arrays.toString(ans));

  }

  public static int[] search(int[][] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] == target) {
          return new int[] { i, j };
        }
      }
    }
    return new int[] { -1, -1 };
  }
}
