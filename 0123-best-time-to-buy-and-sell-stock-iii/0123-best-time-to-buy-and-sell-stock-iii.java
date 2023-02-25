class Solution {
    public int maxProfit(int[] prices) {
        int profit1=0,profit2=0,minval1=Integer.MAX_VALUE,minval2=Integer.MAX_VALUE;
        
        for(int currprice:prices){
            minval1=Math.min(minval1,currprice);
            profit1=Math.max(profit1,currprice-minval1);
            
            minval2=Math.min(minval2,currprice-profit1);
            profit2=Math.max(profit2,currprice-minval2);
        }
        return profit1=profit2;
        
    }
}