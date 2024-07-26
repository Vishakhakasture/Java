package Collections;

import java.util.Vector;

public class VectorSize {
  public static void main(String[] args) {
    Vector v = new Vector<>();
    System.out.println(v.capacity());
    System.out.println(v.size());
    v.add(10);
    v.add(20);
    v.add(30);
    v.add(40);
    v.add(50);
    v.add(60);
    v.add(70);
    v.add(80);
    v.add(90);
    v.add(100);
    System.out.println(v.capacity());
    System.out.println(v.size());
    v.add(60);
    v.add(70);
    v.add(80);
    v.add(90);
    v.add(100);
    System.out.println(v.capacity());
    System.out.println(v.size());
    v.add(40);
    v.add(50);System.out.println(v.capacity());
    System.out.println(v.size());
  }
}
