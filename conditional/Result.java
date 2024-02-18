package conditional;

import java.util.*;

public class Result {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter marks of subjects :");
    int m1 = sc.nextInt();
    int m2 = sc.nextInt();
    int m3 = sc.nextInt();
    int m4 = sc.nextInt();
    int m5 = sc.nextInt();
    int per = (m1 + m2 + m3 + m4 + m5) / 5;
    System.out.println("percentage is : " + per);
    switch (per) {
      case 1:
        if (per > 80 && per <= 100)
          System.out.println("First class with distinction");
        break;
      case 2:
        if (per > 60 && per <= 80)
          System.out.println("Second class");
        break;
      case 3:
        if (per > 40 && per <= 60)
          System.out.println("Third class");
        break;
      case 4:
        System.out.println("Pass class");
        break;
      default:
        System.out.println("Fail. Good luck for next time");
        break;
    }
  }
}
