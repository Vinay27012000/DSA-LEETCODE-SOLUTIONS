class Solution {
    public int findPeakElement(int[] nums) {
        int peak=0;
        int max=0;
        
        for(int i=1 ;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                peak=i;
            }
        }
        return peak;
    }
}