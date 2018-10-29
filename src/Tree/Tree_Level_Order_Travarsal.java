package Tree;

public class Tree_Level_Order_Travarsal {
    static class Node{
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static class BinaryTree{
        Node root;

        BinaryTree() {
            root = null;
        }

        void printLevelOrderTraversal() {
            int height = height(root);
            for (int i = 1; i <= height ; i++) {
                printCurrentLevel(root,i);
            }
        }

        int height(Node root) {
            if (root == null) return 0;
            int left_h = height(root.left);
            int right_h = height(root.right);
            return left_h > right_h ? left_h+1 : right_h+1;
        }

        void printCurrentLevel(Node root, int level) {
            if (root == null) return;
            if (level == 1)
                System.out.print(root.data +" ");
            else if (level > 1) {
                printCurrentLevel(root.left , level-1);
                printCurrentLevel(root.right, level-1);
            }
        }

        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();
            tree.root= new Node(1);
            tree.root.left= new Node(2);
            tree.root.right= new Node(3);
            tree.root.left.left= new Node(4);
            tree.root.left.right= new Node(5);

            System.out.println("Level order traversal of binary tree is ");
            tree.printLevelOrderTraversal();
        }
    }
}
