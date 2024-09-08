// time complexity = O(n log n)
// space complexity = O(n)

public class MergeSort {
  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.err.println();
  }

  // recurssive function for merge sort
  public static void mergeSort(int arr[], int si, int ei) {
    if (si >= ei) {
      return;
    }
    int mid = si + (ei - si) / 2;
    mergeSort(arr, si, mid); // left part
    mergeSort(arr, mid + 1, ei); // right part
    merge(arr, si, mid, ei); // merge left and right part
  }

  public static void merge(int arr[], int si, int mid, int ei) {
    int temp[] = new int[ei - si + 1];
    int i = si;
    int j = mid + 1;
    int k = 0;
    while (i <= mid && j <= ei) {
      if (arr[i] < arr[j]) {
        temp[k] = arr[i];
        i++;
      } else {
        temp[k] = arr[j];
        j++;
      }
      k++;
    }
    // left part
    while (i <= mid) {
      temp[k++] = arr[i++];
    }
    // right part
    while (j <= ei) {
      temp[k++] = arr[j++];
    }

    // copying temp sorted array elements into orignal array
    for (k = 0, i = si; k < temp.length; k++, i++) {
      arr[i] = temp[k];
    }
  }

  public static void main(String[] args) {
    int arr[] = { 60, 300, 90, 500000, 2, 8 };
    mergeSort(arr, 0, arr.length - 1);
    printArray(arr);
  }
}