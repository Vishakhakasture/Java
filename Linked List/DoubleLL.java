public class DoubleLL {
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
  public static int size;

  // add first
  public void addFirst(int data) {
    Node newNode = new Node(data);
    size++;
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

    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }

    tail.next = newNode;
    newNode.prev = tail;
    tail = newNode;

  }

  public int removeFirst() {
    if (head == null) {
      System.out.println("DLL is empty...");
      return Integer.MIN_VALUE;
    }

    if (size == 1) {
      int val = head.data;
      head = tail = null;
      size--;
      return val;
    }

    int val = head.data;
    head = head.next;
    head.prev = null;
    size--;
    return val;

  }

  public int removeLast() {
    if (head == null) {
      System.out.println("DLL is empty...");
      return Integer.MIN_VALUE;
    }

    if (size == 1) {
      int val = head.data;
      head = tail = null;
      size--;
      return val;
    }

    int val = tail.data;
    tail = tail.prev;
    tail.next = null;
    size--;
    return val;

  }

  public void print() {
    if (head == null) {
      System.out.println("DLL is empty...");
      return;
    }

    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " <-> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {
    DoubleLL dll = new DoubleLL();
    dll.addFirst(15);
    dll.addFirst(10);
    dll.addFirst(5);
    dll.addLast(20);
    dll.addLast(25);
    dll.addLast(30);
    dll.print();
    dll.removeFirst();
    dll.print();
    dll.removeLast();
    dll.print();
  }
}
