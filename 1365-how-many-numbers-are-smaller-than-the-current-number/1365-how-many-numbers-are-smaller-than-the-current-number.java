class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int []result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            for(int j=0;j<nums.length;j++){
                if (i != j) {
                    if (nums[j]<num){
                        result[i]++;
                 }
                }
            }
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna