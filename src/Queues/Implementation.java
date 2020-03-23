package Queues;

public class Implementation {

    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<Integer>();

        queue.enQueue(100);
        queue.enQueue(200);
        queue.enQueue(400);

        System.out.println(queue.getSize());

        System.out.println(queue.front());
    }

}
