package Searchtechniques;

import java.util.Scanner;

public class LinearSearch {
  public static int linearSearch(int[] a, int key) {
    for (int i = 0; i < a.length; i++) {
      if (key == a[i]) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int[] a = { 10, 20, 30, 40, 10, 60, 70, 80, 10, 100 };
    System.out.println("Enter an element to search: ");
    int key = sc.nextInt();
    int ind = linearSearch(a, key);
    if (ind == -1) {
      System.out.println("Element not found");
    } else {
      System.out.println("Element found at index: " + ind);
    }
  }
}
