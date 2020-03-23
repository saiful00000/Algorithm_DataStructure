package Stacks;

public class Implementation {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();

        stack.push(100);
        stack.push(200);
        stack.push(300);

        stack.printStack();
        System.out.println(stack.peek());

        System.out.println(stack.getSize());

    }


}
