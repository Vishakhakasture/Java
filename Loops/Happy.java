package Loops;

import java.util.Scanner;

public class Happy {
  public static int happyNum(int num) {
    int res = 0;
    while (num > 0) {
      int rem = num % 10;
      res = rem * rem + res;
      num = num / 10;
    }
    return res;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check it is happy or not !");
    int num = sc.nextInt();
    int res = happyNum(num);
    while (res != 4 && res != 1) {
      res = happyNum(res);
    }
    if (res == 1) {
      System.out.println(num + " It is an happy number.");
    } else {
      System.out.println(num + " It is not an happy number");
    }
    // Happy numbers between 1 to 10000
    // for (int k = 1; k <= 10000; k++) {
    // int num = k;
    // int res = happyNum(num);
    // while (res != 4 && res != 1) {
    // res = happyNum(res);
    // }
    // if (res == 1) {
    // System.out.println(num);
    // } else {
    // System.out.println(num);
    // }
    // }
  }
}
