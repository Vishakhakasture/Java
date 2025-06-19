import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
  public static void main(String args[]) {
    int[] arr = { 10, 20, 20, 20, 30, 40 };
    int n = arr.length;
    // first - in place removing duplicates using two pointer approach
    int j = 0; // index of unique
    for (int i = 1; i < n; i++) {
      if (arr[j] != arr[i]) {
        j++;
        arr[j] = arr[i];
      }
    }

    System.out.println("removing duplicates form array using in-place two pointer approach");

    for (int i = 0; i <= j; i++) {
      System.out.print(arr[i] + " ");
    }

    System.out.println();
    // using hashset
    Set<Integer> set = new LinkedHashSet<>(); // it maintains insertion order

    for (int num : arr) {
      set.add(num);
    }

    System.out.println("After removing duplicates from array using Set ");

    for (int num : set) {
      System.out.print(num + " ");
    }
  }
}
