package Collections;

import java.util.TreeSet;

public class TreeSetDemo {
  public static void main(String[] args) {
    TreeSet t = new TreeSet();
    t.add(10);
    t.add(20);
    t.add(30);
    t.add(40);
    t.add(50);
    t.add(60);
    t.add(70);
    t.add(80);
    System.out.println(t);
    t.add(-1);
    t.add(25);
    System.out.println(t);
    System.out.println(t.first());
    System.out.println(t.last());
    System.out.println(t.higher(25));
    System.out.println(t.ceiling(70));
    System.out.println(t.lower(10));
    System.out.println(t.headSet(40));
    System.out.println(t.tailSet(20));
    System.out.println(t.subSet(40, 80));
  }
}
