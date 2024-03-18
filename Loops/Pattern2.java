package Loops;

import java.util.Scanner;

public class Pattern2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows ");
    int n = sc.nextInt();
    int k = 65;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(k + " ");
        k++;
      }
      System.out.println();
    }
    int c = 65;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print((char) c + " ");
        c++;
      }
      System.out.println();
    }
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print((char) c + " ");

      }
      System.out.println();
      c++;
    }
    int ch = 97;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print((char) ch + " ");
        ch++;
      }
      System.out.println();
    }
    sc.close();
  }
}
