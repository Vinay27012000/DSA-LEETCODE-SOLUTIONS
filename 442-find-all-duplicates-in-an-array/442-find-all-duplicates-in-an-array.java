class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       List<Integer> result = new ArrayList();
        int temp;
        for(int i = 0;i<nums.length;i++){
                temp = Math.abs(nums[i]);
            if(nums[temp - 1] > 0){
                nums[temp-1] = nums[temp-1] * (-1) ;
            }
            else{
                
                result.add(Math.abs(nums[i]));
                
            }
        
        }
        return result;
    }
}