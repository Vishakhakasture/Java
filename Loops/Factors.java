package Loops;

import java.util.*;

public class Factors {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to find factors of it ! ");
    int n = sc.nextInt();
    System.out.println("Factors of " + n + " are:");
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        System.out.println(i);
      }
    }
  }
}
