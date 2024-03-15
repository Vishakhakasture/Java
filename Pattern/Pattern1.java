public class Pattern1 {
  public static void main(String[] args) {
    int rows = 5;
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= (rows - i); j++) {
        System.out.print(" " + " ");
      }
      for (int j = 5; j > (rows - i); j--) {
        System.out.print(j + " ");
      }
      for (int j = (rows - i + 2); j <= 5; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
