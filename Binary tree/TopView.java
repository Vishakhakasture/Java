import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopView {
  static class Node {
    int data;
    Node left, right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static class Info {
    Node node;
    int hd;

    Info(Node node, int hd) {
      this.node = node;
      this.hd = hd;
    }
  }

  public static void topView(Node root) {
    Queue<Info> q = new LinkedList<>();

    HashMap<Integer, Node> map = new HashMap<>();

    int min = 0, max = 0;
    q.add(new Info(root, 0));
    q.add(null);

    while (!q.isEmpty()) {
      Info curr = q.remove();
      if (curr == null) {
        if (q.isEmpty()) {
          break;
        } else {
          q.add(null);
        }
      } else {
        if (!map.containsKey(curr.hd)) { // first occurence of hd
          map.put(curr.hd, curr.node);
        }

        if (curr.node.left != null) {
          q.add(new Info(curr.node.left, curr.hd - 1));
          min = Math.min(min, curr.hd - 1);
        }

        if (curr.node.right != null) {
          q.add(new Info(curr.node.right, curr.hd + 1));
          max = Math.max(max, curr.hd + 1);
        }
      }

    }

    for (int i = min; i <= max; i++) {
      System.out.print(map.get(i).data + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.right = new Node(4);
    root.left.right.right = new Node(5);
    root.left.right.right.right = new Node(6);

    topView(root);
  }
}
