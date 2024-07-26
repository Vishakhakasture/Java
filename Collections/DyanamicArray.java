package Collections;

import java.util.Scanner;
import java.util.Vector;

public class DyanamicArray {
  public static void main(String[] args) {
    Vector v = new Vector();
    Scanner sc = new Scanner(System.in);
    int i, choice, data;
    i = 0;
    choice = 1;
    while(choice == 1) {
      System.out.println("Enter data elements: ");
      data = sc.nextInt();
      v.add(data);
      System.out.println("Do you wish to continue: ");
      System.out.println("1. Yes");
      System.out.println("2. No");
      choice = sc.nextInt();
    }
    System.out.println(v);
  }
}
