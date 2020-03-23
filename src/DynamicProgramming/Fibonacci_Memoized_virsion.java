package DynamicProgramming;

public class Fibonacci_Memoized_virsion {
    int[] lookuop = new int[100];

    public void initAArray(){
        for(int i = 0; i < 100; i++){
            lookuop[i] = -1;
        }
    }

    public int getFib(int n){
        if (lookuop[n] == -1){
            if (n <= 1){
                lookuop[n] = n;
            }
            else {
                lookuop[n] = getFib(n-1) + getFib(n - 2);
            }
        }
        return lookuop[n];
    }

    public static void main(String[] args) {
        Fibonacci_Memoized_virsion fibonacci = new Fibonacci_Memoized_virsion();
        fibonacci.initAArray();
        System.out.println(fibonacci.getFib(5));
    }
}
