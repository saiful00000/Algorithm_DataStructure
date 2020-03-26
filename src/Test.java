import java.util.*;

public class Test {

    int[] prices = {2, 3, 5, 1, 4};
    int N = prices.length;
    int[][] cache = new int[N][N];

    int maxprofit(int left, int right){
        if (left > right) {
            return 0;
        }

        if (cache[left][right] != -1) {
            return cache[left][right];
        }

        int year = N - (right - left + 1) + 1;

        return cache[right][left] = Math.max(
                maxprofit(left+1, right) + year * prices[left],
                maxprofit(left, right-1) + year * prices[right]
        );
    }

    void initCache() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                cache[i][j] = -1;
            }
        }
    }

    public static void main(String args[]){
        Test test = new Test();
        test.initCache();
        System.out.println(test.maxprofit(0, test.N-1));
    }
}
