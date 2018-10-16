package LinkedList;

public class LinkedListRepresentation {
    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void printList() {
        Node itr = head;
        while (itr != null) {
            System.out.print(itr.data +" ");
            itr = itr.next;
        }
    }

    public static void main(String[] args) {
        LinkedListRepresentation linkList = new LinkedListRepresentation();
        linkList.head = new Node(100);
        Node second = new Node(200);
        Node third = new Node(300);
        Node fourth = new Node(400);
        Node fifth = new Node(500);

        linkList.head.next = second; second.next = third; third.next = fourth; fourth.next = fifth;

        linkList.printList();
    }
}
