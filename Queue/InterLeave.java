import java.util.*;
import java.util.LinkedList;

public class InterLeave {
  public static void interLeave(Queue<Integer> q) {
    Queue<Integer> first = new LinkedList<>();
    int size = q.size();

    for (int i = 0; i < size / 2; i++) {
      first.add(q.remove()); // 1,2,3,4,5
    }
    while (!first.isEmpty()) {
      q.add(first.remove()); // again in orignal q start adding 1 by 1
      q.add(q.remove()); // 6,7,8,9,10
    }
  }

  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    q.add(6);
    q.add(7);
    q.add(8);
    q.add(9);
    q.add(10);

    interLeave(q);

    while (!q.isEmpty()) {
      System.out.print(q.remove() + " ");
    }
    System.out.println();
  }
}