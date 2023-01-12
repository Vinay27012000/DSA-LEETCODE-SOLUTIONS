class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        if(nums.length==1)
            return 0;
            for(int i=1;i<nums.length;i++){
                if(nums[i-1]<nums[i])
                    continue;
                else{
                    count+=nums[i-1]-nums[i]+1;
                    nums[i]+=nums[i-1]-nums[i]+1;
                }
            }
        return count;
    }
}