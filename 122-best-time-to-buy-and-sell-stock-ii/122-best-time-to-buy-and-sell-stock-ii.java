class Solution {
    public int maxProfit(int[] prices) {
    int sum=0,i,profit=0,n=prices.length;
        for(i=0;i<n-1;i++){
            if(prices[i]<prices[i+1]){
                profit=prices[i+1]-prices[i];
                sum+=profit;
            }
        }
        return sum;
    }
}