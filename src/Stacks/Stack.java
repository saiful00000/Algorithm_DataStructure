package Stacks;

import java.util.Arrays;

public class Stack<T> {
    private int size = -1;
    private T[] stackArray;

    public Stack() {
        this.stackArray = (T[]) new Object[256 * 1024];
        Arrays.fill(stackArray, null);
    }

    void push(T puShValue) {
        if (size < 256 * 1024) {
            size++;
            stackArray[size] = puShValue;
        } else {
            return;
        }
    }

    T pop() {
        T popValue;
        if (size >= 0) {
            popValue = stackArray[size];
            stackArray[size] = null;
            return popValue;
        }
        return null;
    }

    T peek() {
        if (size >= 0){
            return stackArray[size];
        }
        return null;
    }

    int getSize() {
        return this.size + 1;
    }

    boolean isEmpty() {
        return size >= 0;
    }

    void printStack() {
        for (int i = 0; i <= size; i++) {
            System.out.print(stackArray[i] +" ");
        }
        System.out.println();
    }

}
