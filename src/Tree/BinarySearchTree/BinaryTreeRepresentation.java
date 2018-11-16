package Tree.BinarySearchTree;

public class BinaryTreeRepresentation {
    static class Node{
        int value;
        Node left, right;

        Node(int value){
            this.value = value;
            left = right = null;
        }
    }

    static class BinaryTree {
        Node root;

        BinaryTree() { }

        BinaryTree(int value) {
            root = new Node(value);
        }

        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();

            tree.root = new Node(100);
            tree.root.left = new Node(200);
            tree.root.right = new Node(300);
            tree.root.left.left = new Node(400);
            tree.root.left.right = new Node(500);
            tree.root.right.left = new Node(600);
            tree.root.right.right = new Node(700);
        }
    }

}
