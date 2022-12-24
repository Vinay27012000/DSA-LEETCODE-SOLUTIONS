class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int result[]=new int[nums.length];
        int i=0;
        Arrays.fill(result,0);
        while(i<nums.length){
            int n=nums[i];
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j] && i!=j){
                    result[i]++;
                }
            }
            i++;
        }
        return result;
    }
}