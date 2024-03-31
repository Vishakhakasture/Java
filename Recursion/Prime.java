package Recursion;

public class Prime {
  public static boolean checkPrime(int num, int i) {
    if (i == num) {
      return true;
    }
    if (num % i == 0) {
      return false;
    }
    return checkPrime(num, i + 1);
  }

  public static void main(String arg[]) {
    int num = 7;
    int i = 2;
    boolean res = checkPrime(num, i);
    System.out.println(res);
  }
}
