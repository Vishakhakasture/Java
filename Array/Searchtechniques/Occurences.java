package Searchtechniques;

import java.util.Scanner;

public class Occurences {
  public static void occurence(int[] arr, int target) {
    boolean found = false;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        System.out.print(i + " ");
        found = true;
      }
    }
    if (!found) {
      System.out.println("Element is not present in array!");
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int[] arr = { 1, 2, 3, 1, 5, 1, 8, 2, 5 };
    System.out.println("Enter number to check its occurences.");
    int target = sc.nextInt();
    occurence(arr, target);
  }
}
