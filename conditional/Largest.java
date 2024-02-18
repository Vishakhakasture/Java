package conditional;

/* 2. Nested if else statement */
import java.util.Scanner;

public class Largest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any three numbers : ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if (a >= b && a >= c) {
      System.out.println(a + " is greater than " + b + " and " + c + ".");
    } else if (b >= c) {
      System.out.println(b + " is greater than " + a + " and " + c + ".");
    } else {
      System.out.println(c + " is greater than " + a + " and " + b + ".");
    }
  }
}
