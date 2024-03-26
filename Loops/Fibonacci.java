package Loops;

public class Fibonacci {
  public static void fibonacciSeries(int n) {
    int a = 0;
    int b = 1;
    int res = 0;
    for (int i = 0; i < n; i++) {
      System.out.println(a); // holds every digit of series
      res = a + b;
      a = b;
      b = res;
    }
  }

  public static void main(String[] args) {
    int n = 8;
    fibonacciSeries(n);
  }
}
