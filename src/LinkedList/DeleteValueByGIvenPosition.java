package LinkedList;

public class DeleteValueByGIvenPosition {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // method for deletion
    void delete(int position) {
        if (head == null) return;
        Node temp = head;
        if (position == 0) {
            head = temp.next;
            return;
        }
        for (int i = 0; temp != null && i < position-1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null)
            return;
        Node next = temp.next.next;
        temp.next = next;
    }

    // method for insert element
    void add(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    // method for print the list
    void print() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data +" ");
            node = node.next;
        }
        System.out.println();
    }

    // driver method of the class
    public static void main(String[] args) {
        DeleteValueByGIvenPosition linkList = new DeleteValueByGIvenPosition();
        linkList.add(5);
        linkList.add(4);
        linkList.add(3);
        linkList.add(2);
        linkList.add(1);
        linkList.add(0);
        linkList.print();
        linkList.delete(4);
        linkList.print();
        linkList.delete(0);
        linkList.print();
    }
}
