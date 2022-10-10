class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        for(int el : nums){
            map.put(el,map.getOrDefault(el,0)+1);
        }
        
        for(int i=0;i<nums.length;i++){
            int one = nums[i] - diff;
            int second = nums[i] + diff;
            
            if(map.containsKey(one) && map.containsKey(second)){
                    ans++;
            }
        }
        
        return ans;
    }
}