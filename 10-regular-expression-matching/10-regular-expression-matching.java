class Solution {
    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;
        for (int j=1; j<p.length(); j++) {
            if (p.charAt(j) == '*') {
                dp[0][j+1] = dp[0][j-1];
            }
        }
        
        
        for (int i=1; i<s.length()+1; i++) {
            for (int j=1; j<p.length()+1; j++) {
                if (s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '.') {
                    dp[i][j] = dp[i][j] || dp[i-1][j-1];
                }
                
                if (j-2 >=0 && p.charAt(j-1) == '*') {
                    if (s.charAt(i-1) == p.charAt(j-2) || p.charAt(j-2) == '.') {
                        dp[i][j] = dp[i][j] || dp[i-1][j-2] || dp[i-1][j];    
                    } 
                    dp[i][j] = dp[i][j] || dp[i][j-2];                               
                }
            }
        }
        
        return dp[s.length()][p.length()];
        
    }
}
