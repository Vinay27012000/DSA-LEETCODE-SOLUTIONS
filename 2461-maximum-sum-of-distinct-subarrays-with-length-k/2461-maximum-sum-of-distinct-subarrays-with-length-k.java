class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        
        long sum = 0;
        long maxSum = 0;

        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            // Add current element
            sum += nums[right];
            freq.put(nums[right], 
                     freq.getOrDefault(nums[right], 0) + 1);

            // Keep window size = k
            if (right - left + 1 > k) {
                int remove = nums[left];
                sum -= remove;

                freq.put(remove, freq.get(remove) - 1);

                if (freq.get(remove) == 0) {
                    freq.remove(remove);
                }

                left++;
            }

            // Check if all elements are distinct
            if (right - left + 1 == k && freq.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna