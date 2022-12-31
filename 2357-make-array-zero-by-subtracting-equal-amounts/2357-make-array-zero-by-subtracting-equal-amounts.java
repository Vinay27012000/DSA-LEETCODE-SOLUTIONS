class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> list =new HashSet<>();
        for(int x:nums) {
            if(x>0)
                list.add(x);
        }
        return list.size();
    }
}