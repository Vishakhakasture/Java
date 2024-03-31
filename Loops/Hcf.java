package Loops;

import java.util.Scanner;

public class Hcf {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers to find HCF of them.");
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int small;
    int hcf = 1;
    if (n1 < n2) {
      small = n1;
    } else {
      small = n2;
    }
    for (int i = 1; i <= small; i++) {
      if (n1 % i == 0 && n2 % i == 0) {
        hcf = i;
      }
    }
    System.out.println("HCF is: " + hcf);
  }
}
