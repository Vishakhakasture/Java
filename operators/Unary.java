package operators;

/* unary operators Increment - ++ & Decrement - -- */
public class Unary {
  public static void main(String args[]) {
    int a = 5;
    int b = ++a;
    System.out.println(b);
    int c = 10;
    int d = c++;
    System.out.println(d);
    int e = 5;
    int f = --e;
    System.out.println(f);
    int g = 10;
    int h = g--;
    System.out.println(h);
  }
}
