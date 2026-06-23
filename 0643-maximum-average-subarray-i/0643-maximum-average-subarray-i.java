class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum = -Integer.MAX_VALUE;
        int sum = 0;
        for(int i=0, j=0;j<nums.length;j++){
            if(j>=k) {
                sum -= nums[i++];
            }
            sum += nums[j];
            if (j>=k-1)
                maxSum = maxSum > sum ? maxSum : sum;
        }
    return (double) maxSum/k;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna