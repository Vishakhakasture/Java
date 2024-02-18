package operators;

/**
 * Logical operators
 */
public class Logical {
  public static void main(String[] args) {
    int a = 10, b = 20;
    // logical AND - && return true if both conditions are true
    System.out.println((b > a) && (a < b));
    // logical OR - || returns true if either one condition is true
    System.out.println((a > b) || (b > a));
    // logical NOT - ! returns true if given condition is false and viceversa
    System.out.println(!(a < b));
  }

}