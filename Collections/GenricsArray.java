package Collections;

import java.util.*;

public class GenricsArray {
  public static void main(String[] args) {
    ArrayList a = new ArrayList();
    a.add(10);
    a.add("vishu");
    a.add(30.234);
    a.add(true);
    a.add(a);
    System.out.println(a);
    // generics in collection is dyanamic array which stores homogeneous data
    ArrayList<Integer> a1 = new ArrayList<Integer>();
    a1.add(10);
    a1.add(20);
    System.out.println(a1);
    ArrayList<String> a2 = new ArrayList<String>();
    a2.add("vishakha");
    a2.add("prashik");
    System.out.println(a2);
  }
}
