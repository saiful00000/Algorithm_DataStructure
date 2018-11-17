package Tree.BinarySearchTree;

public class Maximum_value_of_BST {
    static class  Node{
        int data;
        Node right, left;

        Node(int data) {
            this.data = data;
        }
    }

    static class BST{

        public static Node insert(Node root, int data) {
            if (root == null)
                return new Node(data);
            if (data < root.data)
                root.left = insert(root.left, data);
            else
                root.right = insert(root.right, data);

            return root;
        }

        public static int maxValueOfTheBst(Node node) {
            if (node == null) return 0;
            if (node.right == null)
                return node.data;
            return maxValueOfTheBst(node.right);
        }

        public static void main(String[] args) {
            Node root = null;
            int[] a = {10, 9, 8, 6, 11, 22, 23};
            for (int data : a) {
                root = insert(root, data);
            }

            System.out.println(maxValueOfTheBst(root));
        }
    }
}
