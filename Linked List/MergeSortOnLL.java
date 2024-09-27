// time complexity = O(n log n)

public class MergeSortOnLL {
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

  public Node midNode(Node head) {
    Node slow = head;
    Node fast = head.next;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    return slow;
  }

  public Node mergeSort(Node head) {

    // corner case
    if (head == null || head.next == null) {
      return head;
    }

    // 1. find mid node

    Node middleNode = midNode(head);

    // 2. call for left half and right half

    Node rightHead = middleNode.next;
    middleNode.next = null;

    Node leftHalf = mergeSort(head);

    Node rightHalf = mergeSort(rightHead);

    // 3. merge both lists

    return merge(leftHalf, rightHalf);
  }

  public Node merge(Node leftHead, Node rightHead) {
    Node mergeLL = new Node(-1);
    Node temp = mergeLL;

    while (leftHead != null && rightHead != null) {
      if (leftHead.data <= rightHead.data) {
        temp.next = leftHead;
        leftHead = leftHead.next;
        temp = temp.next;
      } else {
        temp.next = rightHead;
        rightHead = rightHead.next;
        temp = temp.next;
      }
    }

    // left half
    while (leftHead != null) {
      temp.next = leftHead;
      leftHead = leftHead.next;
      temp = temp.next;
    }

    // right half
    while (rightHead != null) {
      temp.next = rightHead;
      rightHead = rightHead.next;
      temp = temp.next;
    }

    return mergeLL.next;
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
    MergeSortOnLL m = new MergeSortOnLL();
    m.add(1);
    m.add(2);
    m.add(3);
    m.add(4);
    m.add(5);
    // 5->4->3->2->1
    m.print();
    m.head = m.mergeSort(m.head);
    m.print();
  }
}
