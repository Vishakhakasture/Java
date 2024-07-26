package Collections;

import java.util.*;

public class ArrayDemo {
  public static void main(String[] args) {
    ArrayList a = new ArrayList();
    a.add(10);
    a.add(20);
    a.add(30);
    a.add(40);
    a.add(50);
    a.add(60);
    a.add(70);
    a.add(80);
    Iterator itr = a.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
    ListIterator litr = a.listIterator();
    while (litr.hasNext()) {
      System.out.println(litr.next());
    }
    ListIterator rlitr = a.listIterator();
    while (rlitr.hasPrevious()) {
      System.out.println(rlitr.previous());
    }
  }
}
