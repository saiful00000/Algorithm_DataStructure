package DynamicProgramming;

import java.util.Arrays;

public class MinimumStepsToOne_Tabulation {

    public static int getMinStep(int n){
        int[] lookup = new int[n+1];
        lookup[1] = 0;
        for(int i = 2; i <= n; i++){
            lookup[i] = 1 + lookup[i-1];
            if (i % 2 == 0){
                lookup[i] = Math.min(lookup[i] , 1 + lookup[i / 2]);
            }
            if (i % 3 == 0){
                lookup[i] = Math.min(lookup[i], 1 + lookup[i / 3]);
            }
        }
        return lookup[n];
    }

    public static int minSteps(int n){
        int[] lookup = new int[n+1];
        lookup[3] = 2;
        lookup[0] = lookup [1] = lookup[2] = 1;
        for (int i = 4; i <= n; i++) {
            lookup[i] = lookup[i - 1] + lookup[i - 3] + lookup[i - 4];
        }

        return lookup[n];
    }

    public static void main(String[] args) {
        System.out.println(getMinStep(10));
        System.out.println(minSteps(5));
    }
}
