public class BuildTree {
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
  }

  public static void main(String[] args) {
    int nodes[] = { 10, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
    BinaryTree tree = new BinaryTree();
    System.out.println(tree.builldTree(nodes).data);
  }
}
