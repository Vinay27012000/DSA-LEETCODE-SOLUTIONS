class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long range = k;
        long maxSum = 0;
        int i=0, j;
        Set<Integer> dSet = new HashSet<>();
        for (j=0;j<nums.length;j++) {
            if(range == 0) {
                break;
                }
            if(!dSet.contains(nums[j])) {
                dSet.add(nums[j]);
                maxSum += nums[j];
                range--;

            } else {
                dSet.clear();
                if (j!=nums.length-1) {
                    maxSum = 0;
                     
                range = k;
                j = i++;                
                }
            }
        }
        if(dSet.size()<k) {maxSum = 0;}
        long sum=maxSum;
        for (;j<nums.length;j++) {
            if (dSet.size() == k) {
                    dSet.remove(nums[i]);
                    sum -= nums[i++]; 
                }
            if(!dSet.contains(nums[j])) {
                
                dSet.add(nums[j]);
                sum += nums[j];
            } else {
                dSet.clear();
                if (j!=nums.length-1) {
                    sum = 0;
                    j=i++;
                }
            }
            maxSum = Math.max(maxSum, sum);
        }

       return maxSum; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna