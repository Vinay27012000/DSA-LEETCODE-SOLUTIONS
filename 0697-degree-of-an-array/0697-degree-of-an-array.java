class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int maxDegree = -1;
        int minLength = Integer.MAX_VALUE;
        for (int i=0;i<nums.length;i++){
            List<Integer> newList = map.getOrDefault(nums[i], new ArrayList());
            newList.add(i);
            map.put(nums[i], newList);
            maxDegree = Math.max(map.get(nums[i]).size(), maxDegree);
        }
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> values = entry.getValue();
            if (values.size() >= maxDegree) {
                minLength = Math.min(minLength, values.get(values.size()-1) - values.get(0) + 1);
            }
        }
        return minLength;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna