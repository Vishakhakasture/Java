package Loops;

import java.util.Scanner;

public class LcmOfThree {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three numbers to find LCM of them.");
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int n3 = sc.nextInt();
    int great = (n1 > n2) ? (n1 > n3) ? n1 : n3 : (n2 > n3) ? n2 : n3;
    for (int i = great; i <= n1 * n2 * n3; i++) {
      if (i % n1 == 0 && i % n2 == 0 && i % n3 == 0) {
        System.out.println("LCM is: " + i);
        break;
      }
    }
  }
}