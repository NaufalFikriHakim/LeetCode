public class Solutions {
    public static void main(String[] args) {
        
    }

    public int maxProfit(int[] prices){

        int profit = 0;
        int buyPrices = prices[0];

        for (int i = 1; i < prices.length; i++) {

            if (buyPrices > prices[i]) {
                buyPrices = prices[i];
            }

            profit = Math.max(profit, prices[i] - buyPrices);
        }
        
        return profit;
    }
}
