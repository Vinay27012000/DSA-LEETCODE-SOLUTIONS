class Solution {
    public int countLargestGroup(int n) {
        Map<Integer,Integer> map = new HashMap<>();
 
        for ( int i = 1; i<= 36; i++ ){
            map.put(i,0);
        }
 
        for (int i =1 ; i<=n;i++){
 
            int sum = getDigitSum(i);
 
             map.put(sum,map.get(sum)+1);
 
        }
 
        int maxValue = Collections.max(map.values());
 
        int ans =0;
 
         for ( int i = 1; i<= 36; i++ ){
            if(map.get(i)==maxValue){
                ans++;
            }
        }
 
    return ans;
 
    }
 
    public static int getDigitSum(int number) {
    int sum = 0;
    while (number != 0) {
        sum += number % 10;
        number /= 10;       
    }
    return Math.abs(sum);  
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna