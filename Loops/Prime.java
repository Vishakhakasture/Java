package Loops;

import java.util.*;
import java.lang.Math;

public class Prime {
  public static boolean isPrime(int num) {
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check is prime or not !");
    int num = sc.nextInt();
    boolean res = isPrime(num);
    System.out.println(res);
    sc.close();
  }
}
