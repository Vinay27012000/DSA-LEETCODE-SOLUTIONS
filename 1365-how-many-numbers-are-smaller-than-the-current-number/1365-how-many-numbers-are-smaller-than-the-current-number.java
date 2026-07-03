class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int []result = nums.clone();
        // for(int i=0;i<nums.length;i++){
        //     int num = nums[i];
        //     for(int j=0;j<nums.length;j++){
        //         if (i != j) {
        //             if (nums[j]<num){
        //                 result[i]++;
        //          }
        //         }
        //     }
        // }
    int size = nums.length;
    
    Map<Integer,Integer> map = new HashMap<>();
    Arrays.sort(result);
    for(int i=0;i<size;i++){
        if(!map.containsKey(result[i]))
            map.put(result[i], i);
    }
    for(int i=0;i<size;i++){
        result[i]=map.getOrDefault(nums[i],0);
    }
    return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna