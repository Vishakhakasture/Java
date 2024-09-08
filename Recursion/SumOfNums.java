public class SumOfNums {
  public static int calcSum(int n) {
    if (n == 1) {
      return 1;
    }
    return n + calcSum(n - 1);
  }

  public static void main(String[] args) {
    int num = 5;
    System.out.println(calcSum(num));
  }
}
