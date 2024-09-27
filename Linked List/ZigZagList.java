public class ZigZagList {
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
    }

    tail.next = newNode;
    tail = newNode;
  }

  public Node midNode(Node head) {
    Node slow = head;
    Node fast = head.next;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    return slow;
  }

  public void zigzag() {
    // 1. find middle node

    Node middleNode = midNode(head);

    // 2. reverse second half of list

    Node curr = middleNode.next;
    middleNode.next = null;
    Node prev = null;
    Node next;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    // 3. Alternative merge
    // first merged with last passion/manner = 1->(n)->2->(n-1)->3->(n-2).......
    Node left = head;
    Node right = prev;
    Node nextL, nextR;

    while (left != null && right != null) {
      nextL = left.next;
      left.next = right;
      nextR = right.next;
      right.next = nextL;

      left = nextL;
      right = nextR;
    }
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

  public static void main(String[] args) {
    ZigZagList z = new ZigZagList();
    z.add(3);
    z.add(2);
    z.add(1);
    z.add2(4);
    z.add2(5);
    z.print();
    z.zigzag();
    z.print();
  }
}
