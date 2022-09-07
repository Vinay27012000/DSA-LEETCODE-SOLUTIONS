class Solution {
    public int helper(String s,int idx,int dp[])
    {
        if(idx==s.length())
        {
            return dp[idx]=1;
        }
        if(dp[idx]!=-1)
        {
            return dp[idx];
        }
        char ch1=s.charAt(idx);
        if(ch1=='0')
        {
            return dp[idx]= 0;
        }
        int count=0;
        count+=helper(s,idx+1,dp);
        
        if(idx<s.length()-1)
        {
            char ch2=s.charAt(idx+1);
            int num=(ch1-'0')*10+(ch2-'0');
            if(num<=26)
            {
                count+=helper(s,idx+2,dp);
            }
        }        
      return dp[idx]= count;          
    }
    public int numDecodings(String s) {
        if(s.length()==0)
        {
            return 0;
        }
        int n=s.length();
        int dp[]=new int [n+1];
        Arrays.fill(dp,-1);
        return helper(s,0,dp);
    }
}