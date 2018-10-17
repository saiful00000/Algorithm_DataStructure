package LinkedList;

public class LinkListDeletionByGivenKey {
    Node head;

    // inner class for constructing linked List
    class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // method for add element at front of the linked list
    void addElement(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    // method for delet an element from linklist by given key
    void deleteElement(int key) {
        Node temp = head;
        Node prev = null;
        if (temp != null && temp.data == key) {
            head = head.next;
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) return;

        prev.next = temp.next;
    }

    // method for print all the element of the list
    void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data +" ");
            node = node.next;
        }
        System.out.println();
    }

    // driver method of this class
    public static void main(String[] args) {
        LinkListDeletionByGivenKey list = new LinkListDeletionByGivenKey();
        list.addElement(5);
        list.addElement(4);
        list.addElement(3);
        list.addElement(2);
        list.addElement(1);
        list.printList();
        list.deleteElement(4);
        list.printList();
    }
}
