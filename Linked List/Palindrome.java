public class Palindrome {
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

  // slow-fast approach
  public Node midNode(Node head) {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next; // +1
      fast = fast.next.next; // +2
    }
    return slow; // middle node
  }

  public boolean isPalindrome() {
    // corner case
    if (head == null || head.next == null) {
      return true;
    }
    // step 1 - find mid node

    Node middleNode = midNode(head);

    // step 2 - reverse second half

    Node prev = null;
    Node curr = middleNode;
    Node next;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;

    }

    Node right = prev; // rigt halfs head
    Node left = head; // left halfs head

    // check first half with second half

    while (right != null) {
      if (left.data != right.data) {
        return false;
      }
      left = left.next;
      right = right.next;
    }

    return true;
  }

  public void print() {
    if (head == null) {
      System.out.println("LL is null");
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
    Palindrome p = new Palindrome();
    p.add(2);
    p.add(1);
    p.add2(2);
    p.add2(1);
    p.print();
    System.out.println(p.isPalindrome());
  }
}
