package Tree.BinarySearchTree;

public class Iterative_Search_A_Key_in_BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static class BST {

        // method for cheack if the given key is exist i the tree
        static void searchTheKey(Node root, int key) {
            if (root == null) {
                System.out.println("The given key is not found.");
                return;
            }
            while (root != null) {
                if (root.data == key) {
                    System.out.println("Y");
                    return;
                }
                if (key < root.data) root = root.left;
                else root = root.right;
            }

            System.out.println("N");
        }

        // method for insert value in binary Tree
        static Node insert(Node root, int data) {
            if (root == null)
                return new Node(data);

            if (data < root.data)
                root.left = insert(root.left, data);
            else
                root.right = insert(root.right, data);

            return root;
        }

        //driver method of the class or the main method
        public static void main(String[] args) {
            Node root = null;
            int[] array = {15, 10, 20, 8, 12, 16, 25};
            for (int data: array) {
                root = insert(root, data);
            }

            searchTheKey(root,25);
        }
    }
}
