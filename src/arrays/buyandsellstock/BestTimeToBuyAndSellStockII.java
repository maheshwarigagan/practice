package arrays.buyandsellstock;

public class BestTimeToBuyAndSellStockII {

    public static int maxProfit(int[] prices) {
        int profit = 0;

        int i=0;
        int N = prices.length-1;
        while(i<N){
            while(i<N && prices[i+1]<=prices[i]){
                i++;
            }
            int valley = prices[i];
            while(i<N && prices[i+1]>prices[i]){
                i++;
            }
            int peak = prices[i];
            profit+=peak-valley;
        }

        return profit;
    }
}
