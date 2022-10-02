class Solution {
    public int thirdMax(int[] nums) {
      int i=0;
        long fmax=Long.MIN_VALUE,smax=Long.MIN_VALUE,tmax=Long.MIN_VALUE;
        
        for(i=0;i<nums.length;i++){
            if(fmax==nums[i] || smax==nums[i] || tmax==nums[i]){
                continue;
            }
            else{
            if(nums[i]>fmax){
                tmax=smax;
                smax=fmax;
                fmax=nums[i];
            }
            else if(nums[i]>smax){
                tmax=smax;
                smax=nums[i];
            }
            else if(nums[i]>tmax){
                tmax=nums[i];
            }
            }
        }
        if(nums.length<3 || tmax==Long.MIN_VALUE){
            int f=(int)fmax;
            return f; 
        }
        
            int t=(int)tmax;
            return t;
    }
}