public class LCA2 {
  static class Node {
    int data;
    Node left, right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static Node lca2(Node root, int n1, int n2) {
    if (root == null || root.data == n1 || root.data == n2) {
      return root;
    }

    Node leftLca = lca2(root.left, n1, n2);
    Node rightLca = lca2(root.right, n1, n2);

    // if rightlca = value and leftlca = null
    if (rightLca == null) {
      return leftLca;
    }
    // if left = value and right = null
    if (leftLca == null) {
      return rightLca;
    }

    return root;
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right = new Node(3);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    int n1 = 7, n2 = 6;

    System.out.println(lca2(root, n1, n2).data);
  }
}