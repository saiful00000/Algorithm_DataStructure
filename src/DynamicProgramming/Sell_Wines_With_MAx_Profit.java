package DynamicProgramming;

public class Sell_Wines_With_MAx_Profit {

    private static int cnt = 0;
    private static int[] prices;
    private static int[][] lookup;

    // initialize the lookup array with the value -1
    private static void initLookup() {
        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < prices.length; j++) {
                lookup[i][j] = -1;
            }
        }
    }

    private static int getMaxProfit(int start, int end) {
        cnt++;

        if (start > end) {
            return 0;
        }

        if (lookup[start][end] != -1) {
            return lookup[start][end];
        }

        int year = prices.length - (end - start + 1) + 1;

        return lookup[start][end] = Math.max(getMaxProfit(start+1, end) + prices[start] * year,
                getMaxProfit(start, end-1) + year * prices[end]);
    }

    public static void main(String[] args) {
        prices = new int[]{2, 3, 5, 1, 4};
        lookup = new int[prices.length][prices.length];
        initLookup();
        System.out.println("Mx profit = "+getMaxProfit(0, prices.length-1));
        System.out.println("total function call = "+ cnt);
    }

}
