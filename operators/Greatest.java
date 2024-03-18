package operators;

public class Greatest {
  public static void main(String[] args) {
    int a = 5;
    int b = 50;
    int c = 20;
    int res = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
    System.out.println("Greatest among three is " + res);
  }
}
