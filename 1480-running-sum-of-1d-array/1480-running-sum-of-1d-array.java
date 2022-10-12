class Solution {
    public int[] runningSum(int[] nums) {
       int i,sum=0;
        
        for(i=0;i<nums.length;i++){
            sum=sum+nums[i];
            nums[i]=sum;
        }
        return nums;
    }
}