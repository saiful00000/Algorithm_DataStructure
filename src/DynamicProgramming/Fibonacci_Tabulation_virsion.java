package DynamicProgramming;

import java.util.Arrays;

public class Fibonacci_Tabulation_virsion {
    int[] lookup = new int[100];

    public int getFib(int n){
        lookup[0] = 0;
        lookup[1] = 1;
        for (int i = 2; i <= n; i++) {
            lookup[i] = lookup[i-1] + lookup[i-2];
        }
        return lookup[n];
    }

    public static void main(String[] args) {
        Fibonacci_Tabulation_virsion fibonacci = new Fibonacci_Tabulation_virsion();
        System.out.println("5th fibonacci number is"+fibonacci.getFib(5));
        System.out.println(Arrays.toString(fibonacci.lookup));
    }

}
