package DynamicProgramming;

public class Unique_Path_in_A_Matrix {

    static int[][] dp;

    static void init() {
        for (int i = 0; i < 3; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < 4; i++) {
            dp[0][i] = 1;
        }
    }

    static int totalPath(int m, int n) {

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" "+ dp[i][j]);
            }
            System.out.println();
        }

        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        dp = new int[3][4];
        init();
        System.out.println(totalPath(3,4));
    }
}
