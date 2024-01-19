class Solution {
    // static int fibo(int n,int []dp)
    // {
    //     if(n==0)
    //         return 0;
    //     if(n==1)
    //         return 1;
    //     if(dp[n]!=-1)
    //         return dp[n];
    //     return fibo(n-1,dp)+fibo(n-1,dp);
    // }
    public int fib(int n) {
//         int dp[]=new int[n+1];
       
//         Arrays.fill(dp,-1);
         
         if(n== 0)
             return 0;
        if(n==1)
            return 1;
        
//          for(int i=2;i<=n;i++){
//              dp[i]=fibo(i-1,dp)+fibo(i-2,dp);
//          }
        
//         return dp[n];
        
        
//         memory efficient code
        
        int prev1=0;
        int prev2=1;
        int curr;
        for(int i=2;i<=n;i++){
            curr=prev1+prev2;
            prev1=prev2;
            prev2=curr;
        }
        return prev2;
    }
}