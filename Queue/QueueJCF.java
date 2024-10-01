import java.util.*;
import java.util.LinkedList;

public class QueueJCF {
  public static void main(String[] args) {
    // queue in java is an interface that implements LinkedList or ArrayDeque
    Queue<Integer> q = new LinkedList<>();
    // queue using ArrayDeque
    Queue<Integer> dq = new ArrayDeque<>();
    q.add(1);
    q.add(2);
    q.add(3);

    dq.add(4);
    dq.add(5);
    dq.add(6);

    System.out.println("using LinkedList");
    while (!q.isEmpty()) {
      System.out.println(q.peek());
      q.remove();
    }

    System.out.println("using ArrayDeue");
    while (!dq.isEmpty()) {
      System.out.println(dq.peek());
      dq.remove();

    }
  }
}
