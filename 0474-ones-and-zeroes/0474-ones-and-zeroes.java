class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        
         int[][] arr = new int[m+1][n+1];
       
        for(String s:strs){
            int m1=0,n1=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0'){
                    m1++;
                }
                else{
                    n1++;
                }
            }
             for(int i=m;i>=m1;i--){
                for(int j=n;j>=n1;j--){
                    arr[i][j] = Math.max(arr[i][j],arr[i-m1][j-n1] + 1);
                }
                 
            }
            
        }
    
        return arr[m][n];
    }
}