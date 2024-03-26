package Loops;

public class Armstrong {
  public static int findPower(int rem, int digit) {
    int res = 1;
    while (digit > 0) {
      res = res * rem;
      digit--;
    }
    return res;
  }

  public static int findDigit(int num) {
    int digit = 0;
    while (num > 0) {
      num = num / 10;
      digit++;
    }
    return digit;
  }

  public static int armstrongNum(int num) {
    int res = 0;
    int digit = findDigit(num);
    while (num > 0) {
      int rem = num % 10;
      // res = (int) Math.pow(rem, digit) + res;
      res = res + findPower(rem, digit);
      num = num / 10;
    }
    return res;
  }

  public static void main(String[] args) {
    for (int k = 1; k <= 1000000; k++) {
      int num = k;
      int res = armstrongNum(num);
      if (res == num) {
        System.out.println(res);
      }
    }
  }
}
