package Tree;

import java.util.Stack;

public class BST_InOrder_Traversal {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static class BT{
        Node root;

        BT() {
            root = null;
        }

        public void inOrder() {
            if(root == null) return;

            Stack<Node> stack = new Stack<Node>();
            Node current = root;

            while (current != null || stack.size() > 0) {
                while (current != null) {
                    stack.push(current);
                    current = current.left;
                }
                current = stack.pop();
                System.out.print(current.data +" ");
                current = current.right;
            }
        }

        public static void main(String[] args) {
            BT tree = new BT();
            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);
            tree.root.left.left = new Node(4);
            tree.root.left.right = new Node(5);

            tree.inOrder();
        }
    }


}
