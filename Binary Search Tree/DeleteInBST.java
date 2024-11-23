public class DeleteInBST {
  public static class Node {
    int data;
    Node left, right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }

  }

  public static Node buildBST(Node root, int val) {
    if (root == null) {
      root = new Node(val);
      return root;
    }

    if (root.data > val) {
      root.left = buildBST(root.left, val);
    } else {
      root.right = buildBST(root.right, val);
    }

    return root;
  }

  public static Node deleteNode(Node root, int val) {
    if (root.data < val) {
      root.right = deleteNode(root.right, val);
    } else if (root.data > val) {
      root.left = deleteNode(root.left, val);
    } else {
      // case 1 - Delete leaf node
      if (root.left == null && root.right == null) {
        return null;
      }

      // case 2 - Delete single child node
      if (root.left == null) {
        return root.right;
      } else if (root.right == null) {
        return root.left;
      }

      // case 3 - Delete two child node
      Node IS = inorderSuccessor(root.right);
      root.data = IS.data;
      root.right = deleteNode(root.right, IS.data);
    }

    return root;
  }

  public static Node inorderSuccessor(Node root) {
    while (root.left != null) {
      root = root.left;
    }
    System.err.println("   " + root.data);
    return root;
  }

  public static void inorder(Node root) {
    if (root == null) {
      return;
    }

    inorder(root.left);
    // System.out.print(root.data + " ");
    inorder(root.right);
  }

  public static void main(String[] args) {
    int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
    Node root = null;

    for (int i = 0; i < values.length; i++) {
      root = buildBST(root, values[i]);
    }

    inorder(root);

    deleteNode(root, 5);
    System.out.println();

    inorder(root);
  }
}
