package Collections;

import java.util.*;

public class HashMapDemo {
  public static void main(String[] args) {
    HashMap hm = new HashMap();
    hm.put(100, "'Vishu',7987392836, 'pune'");
    hm.put(101, "'Sonu',7987392836, 'sambhaji nagar'");
    hm.put(102, "'Bittu',7987392836, 'delhi'");
    hm.put(103, "'Shanu',7987392836, 'pune'");
    hm.put(104, "'Kittu',7987392836, 'pune'");
    hm.put(105, "'Manu',7987392836, 'pune'");
    Set k = hm.keySet();
    Iterator itr1 = k.iterator();
    while (itr1.hasNext()== true) {
      System.out.println(itr1.next());
    }
    Collection v = hm.values();
    Iterator itr2 = v.iterator();
    while (itr2.hasNext() == true) {
      System.out.println(itr2.next());
    }
    Set e = hm.entrySet();
    Iterator itr3 = e.iterator();
    while(itr3.hasNext() == true) {
      System.out.println(itr3.next());
    }
  }
}
