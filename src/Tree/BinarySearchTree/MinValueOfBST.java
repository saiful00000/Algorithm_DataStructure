package Tree.BinarySearchTree;

public class MinValueOfBST {
    static class Node{
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static class BST {

        static Node insert(Node root, int data) {
            if (root == null)
                return new Node(data);

            if (data < root.data)
                root.left = insert(root.left, data);
            else
                root.right = insert(root.right, data);

            return root;
        }

        static int minValue(Node root) {
            if (root == null) return 0;
            if (root.left == null)
                return root.data;
            return minValue(root.left);
        }

        public static void main(String[] args) {
            Node root = null;
            int[] array = {15, 10, 20, 8, 12, 16, 25};
            for (int data: array) {
                root = insert(root, data);
            }
            System.out.println("\n" + minValue(root));
        }
    }
}
