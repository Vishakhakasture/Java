public class Preorder {
  static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  static class BinaryTree {
    static int idx = -1;

    public static Node builldTree(int nodes[]) {
      idx++;
      if (nodes[idx] == -1) {
        return null;
      }

      Node newNode = new Node(nodes[idx]);
      newNode.left = builldTree(nodes);
      newNode.right = builldTree(nodes);

      return newNode;
    }

    public static void preorder(Node root) { // O(n)

      if (root == null) {
        System.out.print(-1 + " ");
        return;
      }
      // print root node first
      System.out.print(root.data + " ");
      // get all left subtree
      preorder(root.left);
      // get all right subtree
      preorder(root.right);
    }
  }

  public static void main(String[] args) {
    int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
    BinaryTree tree = new BinaryTree();
    Node root = tree.builldTree(nodes);

    tree.preorder(root);

  }

}
