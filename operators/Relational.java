package operators;

public class Relational {
  public static void main(String[] args) {
    int a = 10;
    int b = 15;
    /* greater than > & grater than or equals to >= */
    if (a > b) {
      System.out.println(a + " is greater than " + b);
    } else {
      System.out.println(b + " is greater than " + a);
    }
    /* Equals to == & not equal to != */
    if (a == b) {
      System.out.println(a + " is equals to  " + b);
    } else {
      System.out.println(b + " is not equals to " + a);
    }
    /* less than < & less than or equals to > */
    if (a < b) {
      System.out.println(a + " is less than " + b);
    } else {
      System.out.println(b + " is greater than " + a);
    }
  }
}
