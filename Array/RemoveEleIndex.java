import java.util.*;

public class RemoveEleIndex {
  public static void main(String args[]) {
    int[] arr = { 10, 20, 30, 40, 50, 60 };
    int index = 3;
    int[] arr1 = new int[arr.length - 1];
    for (int i = 0; i < index; i++) {
      arr1[i] = arr[i];
    }
    for (int i = index + 1; i < arr.length; i++) {
      arr1[i - 1] = arr[i];
    }
    System.out.println(Arrays.toString(arr1));
  }
}
