public class ReverseDLL {
  public class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
      this.data = data;
      this.next = null;
      this.prev = null;
    }
  }

  public static Node head;
  public static Node tail;

  public void addFirst(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }

    newNode.next = head;
    head.prev = newNode;
    head = newNode;
  }

  public void addLast(int data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = tail = newNode;
      return;
    }

    tail.next = newNode;
    newNode.prev = tail;
    tail = newNode;

  }

  public void print() {
    if (head == null) {
      System.out.println("LL is empty...");
      return;
    }

    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " <-> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  // reverse linked list TC = O(n)
  public void reverseList() {
    Node prev = null;
    Node curr = tail = head;
    Node next; // initialize in loop

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      curr.prev = next;
      prev = curr;
      curr = next;
    }
    head = prev;
  }

  public static void main(String[] args) {
    ReverseDLL r = new ReverseDLL();
    r.addFirst(2);
    r.addFirst(1);
    r.addLast(3);
    r.addLast(4);
    r.addLast(5);
    r.print();
    r.reverseList();
    r.print();
  }
}
