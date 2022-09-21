class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] dp = new Boolean[s.length()];
        return f(s, 0, wordDict, dp);
    }
    public boolean f(String s, int i, List<String> list, Boolean[] dp){
        if(i==s.length()){
            return  true;
        }
        if(dp[i]!=null){
            return dp[i];
        }
        for(int j=i;j<=s.length();j++){
            String sub = s.substring(i, j);
            if(list.contains(sub)){
                if(f(s,j, list, dp)){
                    return dp[i]= true;
                }
            }
        }
        return dp[i]=false;
    }
}
