package Loops;

public class Pattern5 {
  public static void main(String[] args) {
    int n = 5, m = 9;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if ((i + j == 4) || (j - i == 4) || (i == 4 && j % 2 == 0)) {
          System.out.print("*" + " ");
        } else {
          System.out.print(" " + " ");
        }
      }
      System.out.println();
    }
  }
}
