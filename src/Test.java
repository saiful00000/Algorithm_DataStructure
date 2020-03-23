import java.util.*;

public class Test {
    public static void main(String[] args) {
        addTwoNumbers(new int[] {1,2}, new int[] {1,2});
    }
    public static void addTwoNumbers(int[] l1, int[] l2) {
        int first = 0;
        int second = 0;
        int sum;

        int i = 0;
        while(i < l1.length){
            int v = l1[i];
            first = first * 10 + v;
            i++;
        }

        i = 0;
        while(i < l2.length){
            int v = l2[i];
            second = second * 10 + v;
            i++;
        }

        System.out.println(first);
        System.out.println(second);

        /*sum = first + second;
        if(sum == 0){
            return new ListNode(0);
        }
        l1 = null;

        while(sum != 0){
            int rem = sum % 10;
            sum /= 10;
            ListNode node = new ListNode(rem);
            node.next = l1;
            l1 = node;
        }*/
    }
}
