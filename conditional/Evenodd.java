package conditional;

import java.util.Scanner;

/* 1. if else statement */
public class Evenodd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number :");
    int num = sc.nextInt();
    if (num % 2 == 0) {
      System.out.println(num + " is even number.");
    } else {
      System.out.println(num + " is odd number.");
    }
  }
}
