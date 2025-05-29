package Loops;

public class Diamond {
  // *
  // * *
  // * * *
  // * * * *
  // * * * * *
  // * * * *
  // * * *
  // * *
  // *

  public static void main(String[] args) {
    int rows = 5;
    // First half - pyramid
    for (int i = 1; i <= rows; i++) {
      // spaces
      for (int j = 1; j <= rows - i; j++) {
        System.out.print(" " + " ");
      }
      // stars
      for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }
    // Bottom Half- Inverted pyramid
    for (int i = rows - 1; i >= 1; i--) {
      // spaces
      for (int j = 1; j <= rows - i; j++) {
        System.out.print("  ");
      }
      // stars
      for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
