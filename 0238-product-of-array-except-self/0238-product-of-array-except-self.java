class Solution {
    public int[] productExceptSelf(int[] nums) {
    int nonZeroProduct = 1;
    boolean isOneZero = false;
    int zeroCount = 0;
    int totalProduct = 1;
     for(int i =0;i<nums.length;i++){
        totalProduct*=nums[i];

        if(nums[i] == 0) {
            zeroCount++;
            if(zeroCount!=1)
            nonZeroProduct*=nums[i];
        }
        else
            nonZeroProduct*=nums[i];
        
    }    
    
    for(int i =0;i<nums.length;i++){
        if(nums[i]!=0)
            nums[i]=totalProduct/nums[i];
        else
            nums[i]=nonZeroProduct;
    }

    return nums;
                    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna