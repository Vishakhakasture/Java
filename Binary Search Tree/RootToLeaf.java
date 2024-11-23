import java.util.*;

public class RootToLeaf {
  static class Node {
    int data;
    Node left, right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static Node buildBst(Node root, int val) {
    if (root == null) {
      root = new Node(val);
      return root;
    }

    if (root.data > val) {
      root.left = buildBst(root.left, val);
    } else {
      root.right = buildBst(root.right, val);
    }

    return root;
  }

  public static void printPath(ArrayList<Integer> path) {
    for (int i = 0; i < path.size(); i++) {
      System.out.print(path.get(i) + "->");
    }
    System.out.println("Null");
  }

  public static void root2Leaf(Node root, ArrayList<Integer> path) {
    if (root == null) {
      return;
    }
    path.add(root.data);

    if (root.left == null && root.right == null) {
      printPath(path);
    }

    root2Leaf(root.left, path);
    root2Leaf(root.right, path);
    path.remove(path.size() - 1);
  }

  public static void main(String[] args) {
    int values[] = { 8, 5, 3, 6, 10, 11, 12 };

    Node root = null;

    for (int i = 0; i < values.length; i++) {
      root = buildBst(root, values[i]);
    }

    root2Leaf(root, new ArrayList<>());

  }
}
