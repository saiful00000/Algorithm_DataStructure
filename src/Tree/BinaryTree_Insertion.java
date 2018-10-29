package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree_Insertion {

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            left = right = null;
        }
    }

    static Node root;
    static Node temp = root;

    static void inOrder(Node temp) {
        if (temp == null)
            return;

        inOrder(temp.left);
        System.out.print(temp.value +" ");
        inOrder(temp.right);
    }

    static void insert(Node temp, int value) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(temp);

        while (!queue.isEmpty()) {
            temp = queue.peek();
            queue.remove();

            if (temp.left == null) {
                temp.left = new Node(value);
                break;
            }else {
                queue.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = new Node(value);
                break;
            }else queue.add(temp.right);
        }
    }

    public static void main(String[] args) {
        root = new Node(100);
        root.left = new Node(110);
        root.left.left = new Node(70);
        root.right = new Node(90);
        root.right.left = new Node(150);
        root.right.right = new Node(80);

        int value = 120;

        System.out.println("The tree inorder travarsal before insertion is : ");
        inOrder(root);

        insert(root, value);

        System.out.println("\nThe tree inorder travarsal after insertion is : ");
        inOrder(root);
    }
}
