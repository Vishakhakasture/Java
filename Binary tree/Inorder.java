public class Inorder {
  static class Node {
    int data;
    Node left, right;

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

    public static void inorder(Node root) {
      if (root == null) {
        return;
      }

      inorder(root.left);
      System.out.print(root.data + " ");
      inorder(root.right);

    }

  }

  public static void main(String[] args) {
    int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
    BinaryTree tree = new BinaryTree();

    Node root = tree.builldTree(nodes);

    tree.inorder(root);

  }
}