package LinkedList;

public class LiskedListWithAllOperation {

    Node head;
    static class Node {
        private int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // method for push element at foront of the linked list
    public void pushFront(int data) {
        Node new_head = new Node(data);
        new_head.next = head;
        head = new_head;
    }

    // method for add element after a given node
    public void insertAfter(Node prev_node, int data) {
        if (prev_node == null) {
            System.out.println("Given node should not be null");
            return;
        }
        Node new_node = new Node(data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    // method for add a new node at the end of the list
    public void append(int data) {
        Node last_node = new Node(data);
        if (head == null) {
            head = new Node(data);
            return;
        }
        last_node.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = last_node;
        return;
    }

    // method for print all the element of the list
    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data +" ");
            node = node.next;
        }
    }

    // driver method of the class
    public static void main(String[] args) {
        LiskedListWithAllOperation link_list = new LiskedListWithAllOperation();
        link_list.pushFront(1);
        link_list.insertAfter(link_list.head, 2);
        link_list.append(3);

        link_list.printList();
    }
}














