package PrimeNumbers;

import java.util.Arrays;

/*
*  java code for get all prime numbers in sequence of
*  0 to n using seive of aratosthenes algorithm
*
**/
public class SeiveOfAratosthenes {
    private static boolean[] seiveAlgo(int n) {
        boolean isPrime[] = new boolean[n+1];
        for (int i = 0; i < n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i*i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * 2; j <= n; j = j + i)
                    isPrime[j] = false;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        int n = 100;
        boolean ans[] = seiveAlgo(n);
        for (int i = 2; i <= n; i++) {
            if (ans[i] == true) {
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }
}
