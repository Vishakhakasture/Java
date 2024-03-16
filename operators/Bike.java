package operators;

public class Bike {
  public static void main(String[] args) {
    int salary = 300000;
    if (salary > 500000) {
      System.out.println("Go for sports bike");
    } else if (salary >= 300000) {
      System.out.println("Go for Bullet");
    } else if (salary >= 150000) {
      System.out.println("Go with Shine");
    } else {
      System.out.println("Go with Activa");
    }
  }
}
