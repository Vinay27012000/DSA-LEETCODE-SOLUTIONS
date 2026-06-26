class Solution {
    public int maxSum(int[] nums) {
        int maxSum = -1;
        for(int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length;j++){
                if(i!=j){
                    if(getlargestNo(nums[i]) == getlargestNo(nums[j]))
                        maxSum = Math.max(maxSum, nums[i]+nums[j]);
                }
            }
        }
        return maxSum;
    }
    int getlargestNo(int num){
        int max = 0;
        while (num>0){
        max = Math.max(max,num%10);
        num/=10;
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna