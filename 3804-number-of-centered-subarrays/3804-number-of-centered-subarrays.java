class Solution {
    public int centeredSubarrays(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += nums[j];
                set.add(nums[j]);

                if (set.contains(sum)) {
                    ans++;
                }
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna