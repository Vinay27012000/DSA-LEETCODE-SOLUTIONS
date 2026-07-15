class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            numMap.put(i,nums[i]);
        }
        for (int i=0;i<nums.length-2;i++) {
            int first = nums[i];
            Map<Integer, Integer> mapData = new HashMap<>();
            for (int j = i+1;j<nums.length;j++) {
                
                    int num = -nums[j] - first;
                    if (mapData.containsKey(num) && mapData.get(num) != j){
                        List<Integer> triplet = new ArrayList<>(Arrays.asList(first, nums[j], num));
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                
                mapData.put(nums[j],j);
            }
        }
        List<List<Integer>> rr = new ArrayList<>();
        for (List<Integer> item : result){
            rr.add(item);
        }
        return rr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna