package Loops;

public class Perfect {
  public static int perfectNum(int num) {
    int res = 0;
    for (int i = 1; i < num; i++) {
      if (num % i == 0) {
        res += i;
      }
    }
    return res;
  }

  public static void main(String[] args) {
    for (int k = 1; k <= 10000; k++) {
      int num = k;
      int res = perfectNum(num);
      if (num == res) {
        System.err.println(num);
      }
    }
  }
}
