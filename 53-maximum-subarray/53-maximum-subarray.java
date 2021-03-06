class Solution
{
  public int maxSubArray(int[] nums) 
  {
      // O(n) time | O(1) space
      int current = nums[0];
      int max = nums[0];
      
      for(int i = 1; i < nums.length; i++)
      {
          current = Math.max(nums[i], nums[i] + current);
          max = Math.max(current, max);
      }
      return max;
  }
}