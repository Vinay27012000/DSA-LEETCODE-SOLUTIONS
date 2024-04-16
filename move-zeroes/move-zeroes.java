class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1)
            return;
        int zero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
                
            }
            else if(zero>0)
            {
                int n=nums[i];
                nums[i]=0;
                nums[i-zero]=n;
            }
        }
    }
}