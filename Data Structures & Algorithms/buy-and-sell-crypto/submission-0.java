class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i=0; i<prices.length-1; i+=1){
            for (int j=i; j<prices.length; j+=1){
                if (prices[j]-prices[i]>maxprofit){
                    maxprofit = prices[j]-prices[i];
                }
            }
        }
        return maxprofit;
    }
}
