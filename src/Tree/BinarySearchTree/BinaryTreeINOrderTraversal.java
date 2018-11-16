package Tree.BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeINOrderTraversal {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static class BinaryTree {
        Node root;

        List<Integer> list = new ArrayList<Integer>();

        // method for in order traversal of binary tree
        public List<Integer> inOrderTraversal(Node tree) {
            if (tree == null) return new ArrayList<Integer>();

            inOrderTraversal(tree.left);
            list.add(tree.data);
            inOrderTraversal(tree.right);

            return list;
        }

        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();

            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);
            tree.root.left.left = new Node(4);
            tree.root.left.right = new Node(5);

            List<Integer> list = tree.inOrderTraversal(tree.root);
            System.out.println(list);
        }
    }

}
