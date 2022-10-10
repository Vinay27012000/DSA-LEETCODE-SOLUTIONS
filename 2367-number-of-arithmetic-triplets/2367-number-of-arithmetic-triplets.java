class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        ArrayList<Integer> list = new ArrayList<>();
        int ans = 0;
        for(int item : nums){
           list.add(item);
        }
        
        for(int i=0;i<nums.length;i++){
            int one = nums[i] - diff;
            int second = nums[i] + diff;
            
            if(list.contains(one) && list.contains(second)){
                    ans++;
            }
        }
        
        return ans;
    }
}