package Loops;

public class Practice {
  public static void main(String[] args) {
    // row variable
    int n = 5;
    // column variable
    int m = 5;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m; j++) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }
    System.out.println("--------------------");
    // *
    // * *
    // * * *
    // * * * *

    for (int i = 1; i < n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }
    System.out.println("--------------------");
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    for (int i = 1; i < n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
    System.out.println("--------------------");
    // * * * *
    // * * *
    // * *
    // *
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m - i; j++) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }
    System.out.println("--------------------");
    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m - i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
    System.out.println("--------------------");
    // *
    // * *
    // * * *
    // * * * *
    for (int i = 1; i <= n; i++) {
      // spaces
      for (int j = i; j <= m - 1; j++) {
        System.out.print(" " + " ");
      }
      // stars
      for (int k = 1; k <= i; k++) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }
    System.out.println("--------------------");
    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    int num = 1;
    for (int i = 1; i < n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(num + " ");
        num++;
      }
      System.out.println();
    }
    System.out.println("--------------------");
    // 1
    // 0 1
    // 1 0 1
    // 0 1 0 1
    for (int i = 1; i < n; i++) {
      for (int j = 1; j <= i; j++) {
        if ((i + j) % 2 == 0) {
          System.out.print(1 + " ");
        } else {
          System.out.print(0 + " ");
        }
      }
      System.out.println();
    }
  }
}
