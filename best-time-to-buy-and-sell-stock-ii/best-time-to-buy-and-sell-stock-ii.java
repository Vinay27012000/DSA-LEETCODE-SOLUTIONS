class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1)
            return 0;
        
        int n=prices.length;
        int max=0;
        for(int i=1;i<n;i++){
            if(prices[i]>prices[i-1])
                max+=prices[i]-prices[i-1];
        }
        return max;
        
    }
}