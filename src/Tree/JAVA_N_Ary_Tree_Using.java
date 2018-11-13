package Tree;

import java.util.ArrayList;
import java.util.List;

public class JAVA_N_Ary_Tree_Using {
    static class Node {
        int data;
        List<Node> child;

        Node() { }

        Node(int data) {
            this.data = data;
            child = new ArrayList<Node>();
        }
    }

    static class Tree {
        Node root;

        public void preOrder(Node tree) {
            if (tree == null)
                return;

            System.out.print(tree.data +" ");
            for (int i = 0; i < tree.child.size(); i++) {
                preOrder(tree.child.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new Node(1);
        tree.root.child.add(new Node(2));
        tree.root.child.add(new Node(3));
        tree.root.child.add(new Node(4));
        tree.root.child.get(0).child.add(new Node(5));
        tree.root.child.get(0).child.add(new Node(6));
        tree.root.child.get(2).child.add(new Node(7));
        tree.root.child.get(2).child.add(new Node(8));
        tree.root.child.get(2).child.add(new Node(9));

        tree.preOrder(tree.root);
    }

}
