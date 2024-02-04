class Solution {
    public int maxProfit(int[] prices) {  
        // at the beginning the minimum price is the first price
        int buy_price = prices[0];

        // at the beginning the minimum profit is zero
        int profit = 0;

        for(int i=1;i<prices.length;i++){
            //if the current price is less update the buy_price
            if(prices[i]< buy_price){
                buy_price = prices[i];
            }
        // else check if we can have a better profit
        else{
            int current_profit = prices[i]- buy_price;
            profit = Math.max(current_profit, profit);
        }
        
    }
    return profit;
    }
}
