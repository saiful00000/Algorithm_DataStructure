package Greedy;

public class CoinChangeProblem {
    public static int numOfChange(int[] coins, int note) {
        if (note == 0) return 0;
        int totalChange = 0;

        for (int i = coins.length-1; i >= 0; i--) {
            int currentCoin = coins[i];
            while (note >= currentCoin) {
                note -= currentCoin;
                totalChange++;
            }
            if (note == 0) {
                break;
            }
        }
        return totalChange;
    }
    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        System.out.println(numOfChange(coins,5000));

        int s = 90;
        int x = s == 90 ? 1 : 0;
    }
}
