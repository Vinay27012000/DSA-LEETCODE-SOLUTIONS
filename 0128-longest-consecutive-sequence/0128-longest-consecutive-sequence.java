class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 1;
        int ans=0;
        Set<Integer> set = new HashSet<>();

        for(int n : nums){
            set.add(n);
        }
        for(int n : set){
            if(!set.contains(n-1)) {
                int curr = n;
           
                count = 1;
                while(set.contains(curr+1)){
                count++;
                curr++;
                }
            }
            
        ans = Math.max(ans, count);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna