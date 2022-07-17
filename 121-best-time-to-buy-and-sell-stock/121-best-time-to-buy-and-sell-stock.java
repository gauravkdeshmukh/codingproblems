class Solution {
    public int maxProfit(int[] prices) {
        int buyDay = 0;
        int sellDay = 1;
        int maxProfit = 0;
        while(sellDay < prices.length){
           if(prices[buyDay] < prices[sellDay]){
               maxProfit = Math.max(maxProfit, prices[sellDay] - prices[buyDay]);
           } else{
               buyDay = sellDay;
           }
           sellDay += 1;
        }
        return maxProfit;
    }
}