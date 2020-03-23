package Queues;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Queue<T> {

    private T[] queueArray;
    private int size = -1;

    public Queue() {
        this.queueArray = (T[]) new Object[256 * 1024];
        Arrays.fill(queueArray, null);
    }

    public void enQueue(T value){
        if (size < 256 * 1024) {
            size++;
            queueArray[size] = value;
        } else {
            System.out.println("Queue Size Exceted");
            return;
        }
    }

    public T deQueue() {
        T value;
        if (size >= 0) {
            value = queueArray[0];
            for (int i = 1; i <= size; i++) {
                queueArray[i - 1] = queueArray[i];
            }
            queueArray[size] = null;
            size--;
            return value;
        } else {
            System.out.println("QUeue is Empty");
            return null;
        }
    }

    public T front() {
        if (!isEmpty()) {
            System.out.println(getSize());
            return queueArray[0];

        } else {
            System.out.println("Queue is EMpty");
            return null;
        }
    }

    public T rear() {
        if (!isEmpty()) {
            return queueArray[size];
        } else {
            System.out.println("Queue is Empty");
            return null;
        }
    }

    public boolean isEmpty() {
        return size < 0;
    }

    public int getSize() {
        return size + 1;
    }

}
