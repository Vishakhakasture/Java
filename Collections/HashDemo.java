package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashDemo {
  public static void main(String args[]) {
    HashSet h = new HashSet<>();
    h.add(10);
    h.add(20);
    h.add(30);
    h.add(40);
    h.add(50);
    h.add(60);
    System.out.println(h);
    LinkedHashSet lh = new LinkedHashSet<>();
    lh.add(70);
    lh.add(80);
    lh.add(90);
    lh.add(100);
    System.out.println(lh);
  }
}
