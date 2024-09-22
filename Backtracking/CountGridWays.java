public class CountGridWays {
  public static int gridWays(int i, int j, int n, int m) {
    // base case condition for last cell
    if (i == n - 1 && j == m - 1) {
      return 1;
    } else if (i == n || j == m) {
      return 0;
    }

    // resursion
    // direction for down
    int w1 = gridWays(i + 1, j, n, m);
    // direction for right
    int w2 = gridWays(i, j + 1, n, m);

    return w1 + w2;

  }

  // public static int gridFormula(int i, int j, int n, int m) {}

  public static void main(String args[]) {
    int n = 20, m = 33;
    int totalWays = gridWays(0, 0, n, m);
    System.out.println("Total ways " + totalWays);
  }
}
