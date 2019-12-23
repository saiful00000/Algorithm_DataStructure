package DynamicProgramming;

/*
* Ugly numbers are numbers whose only prime factors are 2, 3 or 5.
* The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, …
* shows the first 11 ugly numbers. By convention, 1 is included.
*
* Given a number n, the task is to find n’th Ugly number.
* */

public class UglyNumber_basicProblem {

    // brute force solution
    public static int div(int number, int dvsr) {
        while (number % dvsr == 0) {
            number = number/dvsr;
        }
        return number;
    }

    public static boolean isUgly(int n) {
        n = div(n, 2);
        n = div(n, 3);
        n = div(n, 5);

        return (n == 1)? true : false;
    }

    public static int getUglyNumbwe(int n) {
        int i = 1;
        int count = 1;
        while (n > count) {
            i++;
            if (isUgly(i)) {
                count++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        long number = getUglyNumbwe(150);
        System.out.println(number);
    }

    // solution using dynamic programming
    public static int nThUglyNumber(int n) {
        int[] result = new int[n];
        int i2 = 0, i3 = 0, i5 = 0;
        int next_ugly_number = 1;
        int next_multyply_by_2 = 2;
        int next_multyply_by_3 = 3;
        int next_multyply_by_5 = 5;
        result[0] = 1;

        for (int i = 1; i < n; i++) {
            next_ugly_number = Math.min(next_multyply_by_2, Math.min(next_multyply_by_3, next_multyply_by_5));
            result[i] = next_ugly_number;
            if (next_ugly_number == next_multyply_by_2) {
                i2++;
                next_multyply_by_2 = result[i2] * next_ugly_number;
            }
            if (next_ugly_number == next_multyply_by_3) {
                i3++;
                next_multyply_by_3 = result[i3] * next_multyply_by_3;
            }
            if (next_ugly_number == next_multyply_by_5) {
                i5++;
                next_multyply_by_5 = result[i5 * next_multyply_by_5];
            }
        }

        return result[n];
    }
}
