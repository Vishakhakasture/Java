public class Reverse {
  public class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;

  // add elements to linked list

  public void add(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }

    newNode.next = head;
    head = newNode;
  }

  public void add2(int data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = tail = newNode;
      return;
    }

    tail.next = newNode;
    tail = newNode;
  }

  public void print() {
    if (head == null) {
      System.out.println("LL is empty...");
      return;
    }

    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " -> ");
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
      prev = curr;
      curr = next;
    }
    head = prev;
  }

  public static void main(String[] args) {
    Reverse r = new Reverse();
    r.add(2);
    r.add(1);
    r.add2(4);
    r.add2(5);
    r.print();
    r.reverseList();
    r.print();
  }
}
