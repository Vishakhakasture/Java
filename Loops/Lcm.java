package Loops;

import java.util.Scanner;;

public class Lcm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers to find LCM of them.");
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int great;
    if (n1 > n2) {
      great = n1;
    } else {
      great = n2;
    }
    for (int i = great; i <= n1 * n2; i++) {
      if (i % n1 == 0 && i % n2 == 0) {
        System.out.println("LCM is: " + i);
        break;
      }
    }
  }
}
