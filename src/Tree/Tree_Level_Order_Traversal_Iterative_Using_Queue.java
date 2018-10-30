/*
*Tree
*
* Breath first search
*
* This is the code for traverse a tree in level order
*
* Using queue
*
*
* ( I learn tree level order traversal from geeksforgeeks.org and i write the code on my won)
* */

package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree_Level_Order_Traversal_Iterative_Using_Queue {

    // costruct a binary Tree
    static class Node {
        int data;
        Node left;       // left child
        Node right;      // right child

        Node(int data) {
            this.data = data;
            left = null;  // initialize left child as null
            right = null; // initialize right node as null
        }
    }

    static class BinaryTree {
        Node root;

        // default constructor toinitialize object root
        BinaryTree() {
            root = null;
        }

        // method for level order traversal
        void levelOrder() {
            Queue<Node> queue = new LinkedList<Node>();
            queue.add(root);

            while (!queue.isEmpty()) {
                Node currentNode = queue.poll();
                System.out.print(currentNode.data +" ");

                if (currentNode.left != null)
                    queue.add(currentNode.left);
                if (currentNode.right != null)
                    queue.add(currentNode.right);
            }
            System.out.println();
        }

        // driver method of the class
        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();
            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);
            tree.root.left.left = new Node(4);
            tree.root.left.right = new Node(5);

            tree.levelOrder();
        }
    }
}
