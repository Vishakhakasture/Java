package Loops;

import java.util.Scanner;

public class Palindrome {

  public static int palindromeNum(int num) {
    int res = 0;
    while (num > 0) {
      int rem = num % 10;
      res = (res * 10) + rem;
      num = num / 10;
    }
    return res;
  }

  public static void main(String args[]) {
    System.out.println("Palindrome numbers between 1 to 10000");
    for (int k = 1; k < 10000; k++) {
      int num = k;
      int res = palindromeNum(num);
      if (num == res) {
        System.out.println(num);
      }
    }
  }
}
