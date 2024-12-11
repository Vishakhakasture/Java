public class LargestBST {
  public static class Node {
    int data;
    Node left, right;

    Node(int data) {
      this.data = data;
      this.left = this.right = null;
    }
  }

  public static class Info {
    boolean isValidBST;
    int size;
    int min;
    int max;

    Info(boolean isValidBST, int size, int min, int max) {
      this.isValidBST = isValidBST;
      this.size = size;
      this.min = min;
      this.max = max;
    }
  }

  public static int maxSize = 0;

  public static Info largestBSTSize(Node root) {

    // base case
    if (root == null) {
      return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    // check for left and right subtree
    Info leftInfo = largestBSTSize(root.left);
    Info rightInfo = largestBSTSize(root.right);
    int size = leftInfo.size + rightInfo.size + 1;
    int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
    int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

    // isValidBST = false
    if (root.data <= leftInfo.max || root.data >= rightInfo.min) {
      return new Info(false, size, min, max);
    }

    // isValidBST = true
    // calculate for size of BST
    if (leftInfo.isValidBST && rightInfo.isValidBST) {
      maxSize = Math.max(maxSize, size);
      return new Info(true, size, min, max);
    }

    return new Info(false, size, min, max);
  }

  public static void main(String[] args) {
    Node root = new Node(50);
    root.left = new Node(30);
    root.left.left = new Node(5);
    root.left.right = new Node(20);

    root.right = new Node(60);
    root.right.left = new Node(45);
    root.right.right = new Node(70);
    root.right.right.left = new Node(65);
    root.right.right.right = new Node(80);

    Info info = largestBSTSize(root);
    System.out.println("Largest BST size " + maxSize);
  }
}
