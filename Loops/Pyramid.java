package Loops;

public class Pyramid {
  public static void main(String[] args) {
    int rows = 5;
    for (int i = 1; i <= rows; i++) {
      // for spaces
      for (int j = 1; j <= (rows - i); j++) {
        System.out.print(" " + " ");
      }
      // for first half stars
      for (int k = 1; k <= i; k++) {
        System.out.print("*" + " ");
      }
      // for second half stars
      for (int m = 1; m <= i - 1; m++) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }
  }
}
