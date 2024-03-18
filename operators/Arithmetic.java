package operators;

import java.util.*;

class Number {
  public static void main(String args[]) {
    int a, b;
    int c;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter two numbers");
    a = sc.nextInt();
    b = sc.nextInt();
    System.out.println("Enter your choice");
    System.out.println(
        " 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Square \n 5.Cube \n 6.Table \n 7.Division \n 8.Modulous");
    c = sc.nextInt();
    switch (c) {
      case 1:
        System.out.println("Addition of given numbers is :" + (a + b));
        break;
      case 2:
        System.out.println("Subtraction of given numbers is :" + (a - b));
        break;
      case 3:
        System.out.println("Multiplication of given numbers is :" + (a + b));
        break;
      case 4:
        System.out.println("Square of given numbers is :\n" + a + " = " + (a * a) + "\n" + b + " = " + (b * b));
        break;
      case 5:
        System.out.println("Cube of given numbers is :" + (a * a * a) + "and" + (b * b * b));
        break;
      case 6:
        System.out.println("Table of " + a + " is :");
        for (int i = 1; i <= 10; i++) {
          System.out.println(a + "*" + i + "=" + (a * i));
        }
        System.out.println();
        System.out.println("Table of " + b + " is :");
        for (int j = 1; j <= 10; j++) {
          System.out.println(b + "*" + j + "=" + (b * j));
        }
        break;
      case 7:
        System.out.println("Division of given numbers is :" + (a / b));
        break;
      case 8:
        System.out.println("Modulous of given numbers is :" + (a % b));
        break;

    }
    sc.close();
  }
}