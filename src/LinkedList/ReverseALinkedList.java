package LinkedList;

public class ReverseALinkedList {

    Node list;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void add(int data) {
        Node node = new Node(data);
        node.next = list;
        list = node;
    }

    public void printList(Node node) {
        while (node != null) {
            System.out.print(node.data +" ");
            node = node.next;
        }
        System.out.println();
    }

    public Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ReverseALinkedList linkedList = new ReverseALinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.print("The Original list is : ");
        linkedList.printList(linkedList.list);

        Node rev = linkedList.reverseList(linkedList.list);
        System.out.print("The reverset list is : ");
        linkedList.printList(rev);

    }
}












