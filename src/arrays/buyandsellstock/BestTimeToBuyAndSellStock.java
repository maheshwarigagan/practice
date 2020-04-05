package arrays.buyandsellstock;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        // int p = 0;
        // //buy loop
        // for(int i=0;i<prices.length-1;i++){
        //     int tp = 0;
        //     // sell loop
        //     for(int j=i+1;j<prices.length;j++){
        //         if(prices[j]>prices[i]){
        //             tp = Math.max(tp, prices[j]-prices[i]);
        //         }
        //     }
        //     p = Math.max(p, tp);
        // }
        // return p;

        // The trick is to keep track of the minimum value and a maximum value

        if(prices == null || prices.length == 0){
            return 0;
        }
        int p = 0;
        int minimum = prices[0];
        int maximum = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minimum){
                minimum = prices[i];
            }else if(maximum<prices[i]-minimum){
                maximum = prices[i]-minimum;
            }
        }
        return maximum;
    }
}
