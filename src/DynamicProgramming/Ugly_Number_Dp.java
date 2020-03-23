package DynamicProgramming;

public class Ugly_Number_Dp {

    public static int getUglyNumber(int num){

        int[] dp = new int[num];
        int next_udly = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        int next_ugly2 = 2;
        int next_ugly3 = 3;
        int next_ugly5 = 5;

        dp[0] = next_udly;

        for (int i = 1; i < num; i++){
            next_udly = Math.min(Math.min(next_ugly2, next_ugly3), next_ugly5);
            dp[i] = next_udly;

            if (next_udly == next_ugly2){
                i2++;
                next_ugly2 = dp[i2];
            }
            if (next_udly == next_ugly3){
                i3++;
                next_ugly3 = dp[i3];
            }
            if (next_udly == next_ugly5){
                i5++;
                next_ugly5 = dp[i5];
            }


        }
        return dp[num - 1];
    }


    public static void main(String[] args) {
        System.out.println(getUglyNumber(150));
    }
}
