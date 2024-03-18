package Loops;

public class Pattern4 {
  public static void main(String[] args) {
    int n = 6, m = 7;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if ((i == 1 && j % 3 == 0) || (i == 0 && j % 3 != 0) || (i - j == 2) || (i + j == 8)) {
          System.out.print("*" + " ");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    for (int i = n + 1; i < 12; i++) {
      for (int j = 0; j < m; j++) {
        if ((i == 10 && j % 3 == 0) || (i == 11 && j % 3 != 0) || (i + j == 9) || (i - j == 3)) {
          System.out.print("*" + " ");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
