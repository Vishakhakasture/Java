package conditional;

import java.util.Scanner;

/* 4. Ternary statement */
/* variable = Expression1 ? Expression2: Expression3 */
public class Ternary {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any two numbers : ");
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int min;

    // Smallest among n1 and n2
    min = (n1 < n2) ? n1 : n2;

    // Print the smallest number
    System.out.println("Minimum is = " + min);
  }
}
