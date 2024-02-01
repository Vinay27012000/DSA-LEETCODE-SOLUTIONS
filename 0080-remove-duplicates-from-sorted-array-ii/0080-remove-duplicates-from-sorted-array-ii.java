class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1,dup=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
               dup++;
            }
            else{
                dup=1;
            }
            if(dup<3){
                nums[j++]=nums[i];
            }
        }
            return j;
    }
}