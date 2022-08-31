class Solution {
    int n;
    int maxi[][];
    int dp[][];
    public int mctFromLeafValues(int[] a) {
        n = a.length;
        maxi = new int[n][n]; 
        for(int i = 0; i < n; i++){
            maxi[i][i] = a[i];
            for(int j = i + 1; j < n; j++){
                maxi[i][j] = Math.max(maxi[i][j - 1] , a[j]);
            }
        }
        dp = new int[n][n];
        for(int i = 0; i < n; i++){
            Arrays.fill(dp[i] , Integer.MAX_VALUE);
        }
        return f(0 , n - 1);
    }
    int f(int l , int r){
        if(l == r){
            return 0;
        }
        if(dp[l][r] != Integer.MAX_VALUE) return dp[l][r];
        int ans = Integer.MAX_VALUE;
        for(int i = l; i < r; i++){
            ans = Math.min(ans , maxi[l][i] * maxi[i + 1][r] + f(l , i) + f(i + 1 , r)); 
        }
        return dp[l][r] = ans;
    }
}