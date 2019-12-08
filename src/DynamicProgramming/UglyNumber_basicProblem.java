package DynamicProgramming;

/*
* Ugly numbers are numbers whose only prime factors are 2, 3 or 5.
* The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, …
* shows the first 11 ugly numbers. By convention, 1 is included.
*
* Given a number n, the task is to find n’th Ugly number.
* */

public class UglyNumber_basicProblem {

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
}
