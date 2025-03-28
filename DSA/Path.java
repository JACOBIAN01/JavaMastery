import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    // Print the left boundary (excluding leaf nodes)
    void printLeftBoundary(Node node) {
        if (node == null) return;
        if (node.left != null) {
            System.out.print(node.data + " ");
            printLeftBoundary(node.left);
        } else if (node.right != null) {
            System.out.print(node.data + " ");
            printLeftBoundary(node.right);
        }
    }

    // Print all leaf nodes (left to right)
    void printLeaves(Node node) {
        if (node == null) return;
        printLeaves(node.left);
        if (node.left == null && node.right == null)
            System.out.print(node.data + " ");
        printLeaves(node.right);
    }

    // Print the right boundary (excluding leaf nodes, bottom-up)
    void printRightBoundary(Node node) {
        if (node == null) return;
        if (node.right != null) {
            printRightBoundary(node.right);
            System.out.print(node.data + " ");
        } else if (node.left != null) {
            printRightBoundary(node.left);
            System.out.print(node.data + " ");
        }
    }

    // Boundary traversal function
    void boundaryTraversal(Node node) {
        if (node == null) return;

        System.out.print(node.data + " "); // Print root

        // Print left boundary (excluding root and leaf nodes)
        printLeftBoundary(node.left);

        // Print all leaf nodes
        printLeaves(node.left);
        printLeaves(node.right);

        // Print right boundary (excluding root and leaf nodes)
        printRightBoundary(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.right.left = new Node(8);
        tree.root.left.right.right = new Node(9);
        tree.root.right.right.left = new Node(10);
        tree.root.right.right.right = new Node(11);

        System.out.println("Boundary Traversal:");
        tree.boundaryTraversal(tree.root);
    }
}
