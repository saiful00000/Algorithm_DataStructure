/*
* This is a simple java code to create a
* stack using queue with
*
* 1.push   2.pop  3.top  4.isEMpty operations
* */

import java.util.LinkedList;
import java.util.Queue;

public class Stack_Using_Queue {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // push operation for the stack
    public void push(int data) {
        q1.add(data);
        int siz = q1.size();
        while (siz > 1) {
            q1.add(q1.remove());
            siz--;
        }
    }

    //pop operation for the stack
    public void pop() {
        q1.remove();
    }

    // return true if the stack is empty else return false
    public boolean empty() {
        return q1.isEmpty();
    }

    // return top element of the stack
    public int top() {
        return q1.peek();
    }

    // driver method of this class
    public static void main(String[] args) {
        Stack_Using_Queue stack = new Stack_Using_Queue();

        stack.push(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.top());
        System.out.println(stack.empty());

        stack.pop();
        System.out.println(stack.top());
    }
}
