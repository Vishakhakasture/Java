public class RecSearch {
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
      head = tail = null;
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

  // recurssive helper function
  public int helper(Node head, int key) {
    if (head == null) {
      return -1;
    }

    if (head.data == key) {
      return 0;
    }

    int index = helper(head.next, key);
    if (index == -1) {
      return -1;
    }
    return index + 1;
  }

  public int recSearch(int key) {
    return helper(head, key);
  }

  public static void main(String[] args) {
    RecSearch r = new RecSearch();
    r.add(10);
    r.add(20);
    r.add2(30);
    r.add2(40);
    r.add(50);
    r.print();
    System.out.println(r.recSearch(40));
    System.out.println(r.recSearch(10));
  }
}
