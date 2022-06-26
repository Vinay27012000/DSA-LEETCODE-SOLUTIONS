class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int product=1;
        for(int i=nums.length-1;i>nums.length-4;i--)
        {
            product*=nums[i];
        }
        return Math.max(product,nums[0]*nums[1]*nums[nums.length-1]);
    }
}