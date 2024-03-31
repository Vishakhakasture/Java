package Recursion;

public class Armstrong {
  public static int findDigti(int num) {
    int digit = 0;
    while (num > 0) {
      num = num / 10;
      digit++;
    }
    return digit;
  }

  public static int armRec(int num, int res, int digit) {
    if (num == 0) {
      return res;
    }
    return armRec(num / 10, (int) Math.pow((num % 10), digit) + res, digit);
  }

  public static void main(String args[]) {
    int num = 1643;
    int res = 0;
    int digit = findDigti(num);
    int ans = armRec(num, res, digit);
    if (num == ans) {
      System.out.println(ans);
    }
  }
}
