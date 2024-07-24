package Searchtechniques;

import java.util.Arrays;

public class BinarySearch2d {
  public static int[] search(int[][] arr, int target){
    int r = 0;
    int c = arr.length-1;
    while (r < arr.length && c >= 0) {
      if(arr[r][c] == target) {
        return new int[]{r,c};
      }
      if(arr[r][c] < target) {
        r++;
      } else {
        c--;
      }
    }
    return new int[] {-1,-1};
  }
  public static void main(String[] args) {
    // matrix should be sorted
    int[][] arr = {
      { 2, 4, 6 },
      { 8, 10, 12 },
      { 80, 86, 96 }
    };
    int target = 80;
    System.out.println(Arrays.toString(search(arr, target)));
  }
}
