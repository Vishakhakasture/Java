import java.util.LinkedList;;

public class LinkedListJCF {
  public static void main(String[] args) {
    LinkedList<Integer> ll = new LinkedList<>();
    // add
    ll.addLast(2);
    ll.addLast(3);
    ll.addFirst(1);
    ll.addFirst(0);

    System.out.println(ll);
    // remove
    ll.removeLast();
    ll.removeFirst();

    System.out.println(ll);
  }
}
