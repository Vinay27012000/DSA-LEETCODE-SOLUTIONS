class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> data = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            if(data.contains(nums[i])) return true;
            data.add(nums[i]);
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna