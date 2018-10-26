package LinkedList;

public class DeleetTheList {
    Node head;

    class Node {
        private int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // add value
    void add(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    // delete the list
    void delete() {
        head = null;
    }

    // check is the list deleted or not
    void isDeleted() {
        if (head == null)
            System.out.println("The list is null !");
        else
            System.out.println("The list is not null !");
    }

    // driver method of the class
    public static void main(String[] args) {
        DeleetTheList list = new DeleetTheList();
        list.add(1);
        list.add(2);
        list.isDeleted();
        list.delete();
        list.isDeleted();
    }

}
