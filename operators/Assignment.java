package operators;

import java.util.*;

public class Assignment {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any two numbers : ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a += b;
    System.out.println("Addition using assignment operator is: " + sum);
    int diff = a -= b;
    System.out.println("Difference using assignment operator is: " + diff);
    int mul = a *= b;
    System.out.println("Multiplication using assignment operator is: " + mul);
    int div = a /= b;
    System.out.println("Division using assignment operator is: " + div);
    sc.close();
  }
}
