package Loops;

import java.util.Scanner;

public class Reverse {
  public static int reverseNum(int num) {
    int res = 0;
    while (num > 0) {
      int rem = num % 10;
      res = (res * 10) + rem;
      num = num / 10;
    }
    return res;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to give reverse");
    int num = sc.nextInt();
    int res = reverseNum(num);
    System.out.print("Reverse number of given number is : " + res);
  }
}
