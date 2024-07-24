package SortingTechnique;

import java.util.Arrays;

public class InsertionSort {
  public static void sort(int[] arr) {
    for(int i = 0; i < arr.length - 1; i++) { // i < n - 2 (n = length)
      for(int j = i+1; j > 0; j--) {
        if(arr[j-1] > arr[j]) {
          int temp = arr[j-1];
          arr[j-1] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }
  public static void main(String[] args) {
    int[] arr = {5,3,-4,-1,0,2};
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
