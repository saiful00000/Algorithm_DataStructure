/*
* In this below code i show how to construct a Binary Search tree
* And how to insert value in a Binary search tree.
* And also implemented Tree inOrder traversal
* */

package Tree.BinarySearchTree;
public class InsertValueInaBinarySearchTree_BST {
    // construct a node with left and right child and va;ue
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    // class for construct binary search tree
    public static class BST {
        // method for print the BST in inOrder Traversal
        static public void inOrder(Node root) {
            if (root == null)
                return;
            inOrder(root.left);
            System.out.print(root.data +" ");
            inOrder(root.right);
        }
        // method for insert value in binary tree
        static public Node insetValue(Node root, int data) {
            if (root == null)
                return new Node(data);

            if (data < root.data)
                root.left = insetValue(root.left, data);
            else
                root.right = insetValue(root.right, data);

            return root;
        }
        // driver method of the class
        public static void main(String[] args) {
            // initialize the tree as null
            Node root = null;
            // an array with tree values
            int[] array = {15, 10, 20, 8, 12, 16, 25};
            for (int data: array) {
                root = insetValue(root, data);
            }
            // print the constructed binary search tree
            // in inOrder traversal technique
            inOrder(root);
            System.out.printf("");
        }
    }
}
