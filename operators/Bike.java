package operators;

import java.util.Scanner;

public class Bike {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your salary: ");
    int salary = sc.nextInt();
    if (salary > 500000) {
      System.out.println("Go for sports bike");
    } else if (salary >= 300000) {
      System.out.println("Go for Bullet");
    } else if (salary >= 150000) {
      System.out.println("Go with Shine");
    } else {
      System.out.println("Go with Activa");
    }
    sc.close();
  }
}
