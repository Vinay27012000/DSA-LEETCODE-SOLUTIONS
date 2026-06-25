class Solution {
    public int longestOnes(int[] nums, int k) {
        int first =0,last=0;
        int count = k;
        int result = 0;
        while (last<nums.length) {
            if(nums[last]==1) {
                last++;
            } else{
                if(count>0){
                    last++;
                    --count;
                } else {
                    result = Math.max(result, last-first);
                    if(nums[first]==0) {
                        first++;
                    } else {
                        while(nums[first]==1){
                            first++;
                        }
                        first++;
                    }
                    last++;
                }
            }
        }
        return Math.max(result, last-first);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna