package conditional;

/* 3. Nested if statement */
import java.util.Scanner;

public class Leapyear {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter year :");
    int year = sc.nextInt();
    // if year is divided by 4 then is a leap year
    if (year % 4 == 0) {
      System.out.println(year + " is a leap year.");
      // if year is divided by 100 then is leap year
      if (year % 100 == 0) {

        // if year is divided by 400
        // then it is a leap year
        if (year % 400 == 0) {
          System.out.println(year + " is a leap year.");
        } else {
          System.out.println(year + " is not a leap year.");
        }

      } else {
        System.out.println(year + " is not a leap year.");
      }
    } else {
      System.out.println(year + " is not a leap year.");
    }
  }
}
