class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE;
        int maxNo = Integer.MIN_VALUE;
        for (int i=0, j=k;j<nums.length;i++, j++) {
            maxNo = Math.max(nums[i],maxNo);
            maxSum = Math.max(maxSum, maxNo+nums[j]);
        }
        return maxSum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna