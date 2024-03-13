class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0]; //assuming first value as minimum
        int profit=0;
        int cost=0;
        for(int i=1;i<prices.length;i++){
            cost=prices[i]-min;
            profit=Math.max(cost,profit); //comparing the profits
            min=Math.min(min,prices[i]);  //updating the minimum value
        }
        return profit;
    }
}