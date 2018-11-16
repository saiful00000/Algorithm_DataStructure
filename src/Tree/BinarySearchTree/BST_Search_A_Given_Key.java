package Tree.BinarySearchTree;

public class BST_Search_A_Given_Key {
    //class for constructing the structure of a node
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    //class for implement Binary tree and perform search operation
    static class BST {

        // method for cheack if the given key is exist i the tree
        static void searchTheKey(Node root, int key) {
            if (root == null) {
                System.out.println("The given key is not found.");
                return;
            }
            if (root.data == key) {
                System.out.println("The given key is exist in the Tree");
                return;
            }

            if (key < root.data)
                searchTheKey(root.left, key);
            else
                searchTheKey(root.right, key);
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

            System.out.println();
        }
    }

}
