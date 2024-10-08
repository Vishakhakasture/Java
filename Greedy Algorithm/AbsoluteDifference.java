import java.util.*;

public class AbsoluteDifference {
  public static void main(String[] args) { // O(n log n)
    int arr1[] = { 1, 3, 4, 2 };
    int arr2[] = { 5, 6, 1, 2 };

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    int minDiff = 0;

    for (int i = 0; i < arr1.length; i++) {
      minDiff += Math.abs(arr1[i] - arr2[i]);
    }

    System.out.println("Minimum absolute difference of pairs = " + minDiff);
  }
}
