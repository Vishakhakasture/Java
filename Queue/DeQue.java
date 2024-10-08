import java.util.*;
import java.util.LinkedList;

public class DeQue {
  public static void main(String[] args) {
    Deque<Integer> dq = new LinkedList<>();
    dq.addFirst(1);
    dq.addFirst(2);
    dq.addFirst(5);
    dq.addLast(3);
    dq.addLast(4);
    dq.addLast(6);
    System.out.println(dq);
    dq.removeFirst();
    System.out.println(dq);
    dq.removeLast();
    System.out.println(dq);

    System.out.println(dq.getFirst());
    System.out.println(dq.getLast());
  }
}
