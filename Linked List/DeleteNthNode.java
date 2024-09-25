public class DeleteNthNode {
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
      System.out.println("LL is empty");
      return;
    }

    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public void deleteNthNodeFromEnd(int n) {
    int size = 0;
    Node temp = head;
    while (temp != null) {
      temp = temp.next;
      size++;
    }
    System.out.println(size);

    if (n == size) {
      head = head.next; // remove first
      return;
    }

    int i = 1;
    int iFindTo = size - n;
    System.out.println(iFindTo);
    Node prev = head;
    while (i < iFindTo) {
      prev = prev.next;
      i++;
    }

    prev.next = prev.next.next;
    return;
  }

  public static void main(String[] args) {
    DeleteNthNode d = new DeleteNthNode();
    d.add(2);
    d.add(1);
    d.add2(3);
    d.add2(4);
    d.print();
    d.deleteNthNodeFromEnd(4);
    d.print();
  }
}
