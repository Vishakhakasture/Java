public class LinkedList {
  public class Node {
    int data;
    Node next;

    // constructor
    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  // this is the first node in linked list
  public static Node head;
  // this is the last node of linked list
  public static Node tail;
  // to claculate size of linked list
  public static int size;

  // methods to perform simple operations on linked list

  // 1. add elements in linked list

  public void addFirst(int data) { // O(1)
    // create new node
    Node newNode = new Node(data);
    size++;

    // if linked list is empty
    if (head == null) {
      // assign head = tail = newNode
      head = tail = newNode;
      return;
    }

    // assign new nodes next to head
    newNode.next = head; // link

    // assign head to new node
    head = newNode;

  }

  // add to last

  public void addLast(int data) { // O(1)
    // create a newnode
    Node newNode = new Node(data);
    size++;

    // if linked list is empty
    if (head == null) {
      head = tail = newNode;
      return;
    }

    // assign tail next to new node
    tail.next = newNode;

    // assign new nodes to tail

    tail = newNode;

  }

  // print list data
  public void printData() { // O(n)
    // if linked list is empty
    if (head == null) {
      System.out.println("linked list is null");
      return;
    }

    Node temp = head;
    // loop to print list data
    while (temp != null) {
      // print current data
      System.out.print(temp.data + " -> ");
      // point temp to next node
      temp = temp.next;
    }
    System.out.println("null");
  }

  // add to middle
  public void addMiddle(int index, int data) {
    // if linked lis is empty
    if (index == 0) {
      addFirst(data);
      return;
    }
    Node newNode = new Node(data);
    size++;
    Node temp = head;
    int i = 0;
    while (i < index - 1) {
      temp = temp.next;
      i++;
    }
    // i = index - 1 is temp -> prev
    newNode.next = temp.next;
    temp.next = newNode;
  }

  // 2. remove or delete elements from linked list

  public int removeFirst() {
    // if ll is empty
    if (size == 0) {
      System.out.println("linked list is empty...");
      return Integer.MIN_VALUE;
    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }
    int val = head.data;
    head = head.next;
    size--;
    return val;
  }

  // remove last node
  public int removeLast() {
    if (size == 0) {
      System.out.println("ll is emty...");
      return Integer.MIN_VALUE;
    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }

    Node prev = head;
    // to find prev node from linked list
    for (int i = 0; i < size - 2; i++) {
      prev = prev.next;
    }
    int val = prev.next.data; // tail.data
    prev.next = null;
    tail = prev;
    size--;
    return val;
  }

  public static void main(String args[]) {
    LinkedList ll = new LinkedList();
    ll.addFirst(2);
    ll.addFirst(1);
    ll.addLast(3);
    ll.addLast(4);
    ll.addMiddle(4, 5);
    ll.addMiddle(2, 10);
    ll.printData();
    ll.removeFirst();
    ll.printData();
    ll.removeLast();
    ll.printData();
    // System.out.println(ll.size);
  }
}