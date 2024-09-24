public class Search {
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

  // search an key in linked list using iterative search
  public int search(int key) {
    Node temp = head;
    int i = 0;
    while (temp != null) {
      if (temp.data == key) {
        System.out.println("key found at " + i);
      }
      temp = temp.next;
      i++;
    }
    return -1;
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
    Search s = new Search();
    s.add(1);
    s.add(2);
    s.add(3);
    s.add(4);
    s.add(5);
    s.print();
    s.search(3);
    System.out.println(s.recSearch(5));
  }
}
