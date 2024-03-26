package Loops;

public class Happy {
  public static int happyNum(int num) {
    int res = 0;
    while (num > 0) {
      int rem = num % 10;
      res = rem ^ 2 + res;
      num = num / 10;
    }
    return res;
  }

  public static void main(String[] args) {
    int num = 7;
    int res = happyNum(num);

  }
}
