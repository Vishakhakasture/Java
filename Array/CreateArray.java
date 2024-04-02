import java.util.*;

public class CreateArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.err.println("Enter the size of an array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    // Taking array elements
    System.out.println("Enter the elements of array: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    // printing array elements
    System.out.println("Given array elements are: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
