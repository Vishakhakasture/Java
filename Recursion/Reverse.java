package Recursion;

public class Reverse {
  public static int reverseNum(int num, int res) {
    if (num == 0) {
      return res;
    }
    return reverseNum(num / 10, (res * 10) + num % 10);
  }

  public static void main(String[] args) {
    int num = 12345;
    int res = 0;
    int ans = reverseNum(num, res);
    System.out.println(ans);
  }
}
