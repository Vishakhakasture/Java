package Recursion;

public class Factorial {
  public static int fact(int num) {
    if (num == 1) {
      return 1;
    }
    return num * fact(num - 1);
  }

  public static void main(String arg[]) {
    int num = 5;
    int res = fact(num);
    System.out.println(res);
  }
}
