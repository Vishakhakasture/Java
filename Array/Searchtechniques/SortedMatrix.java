package Searchtechniques;

import java.util.*;

public class SortedMatrix {
  // search in the row provided etween the columns provided
  public static int[] binarySerch(int[][] arr, int row,int cStart, int cEnd, int target) {
    while(cStart <= cEnd) {
      int mid = cStart + (cEnd - cStart) / 2;
      if(arr[row][mid] == target) {
        return new int[]{row,mid};
      }
      if(target > arr[row][mid]) {
        cStart = mid + 1;
      } else {
        cEnd = mid - 1;
      }
    }
    return new int[] {-1,-1};
  }
  public static int[] search(int[][] arr,int target) {
    int rows = arr.length;
    int cols = arr[0].length;
    int rStart = 0;
    int rEnd = rows - 1;
    int cMid = cols / 2;
    if(rows == 1) {
      binarySerch(null, 0, 0, cols, target);
    }
    // run the loop till two rows are remaining
    while(rStart < (rEnd - 1)) { // while these is true it will have more than two rows
      int mid = rStart + (rEnd - rStart) / 2;
      if(target == arr[cMid][mid] ) {
        return new int[] {cMid,mid};
      } 
      if(target > arr[cMid][mid] ) {
        rStart = mid;
      } else {
        rEnd = mid;
      }
     }
    //  now we have two rows remaining
    // check whether the target is in the column of 2 rows
    if (arr[rStart][cMid] == target) {
      return new int[] {rStart,cMid};
    }
    if(arr[rStart+1][cMid] == target) {
      return new int[] {rStart+1, cMid};
    }
    return new int[] {-1,-1};
  }
  public static void main(String args[]) {
    int[][] arr= {
      {1,2,3,4},
      {5,6,7,8},
      {9,10,11,12},
      {13,14,15,16},
    };
    int target = 2;
    System.out.println(Arrays.toString(search(arr, target)));
  }
}
