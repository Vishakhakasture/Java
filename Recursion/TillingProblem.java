public class TillingProblem {
  public static int tillingProblem(int n) {
    if (n == 0 || n == 1)
      return 1;
    return tillingProblem(n - 1) + tillingProblem(n - 2);
  }

  public static void main(String[] args) {
    int n = 4;
    System.out.println(tillingProblem(n));
  }
}
