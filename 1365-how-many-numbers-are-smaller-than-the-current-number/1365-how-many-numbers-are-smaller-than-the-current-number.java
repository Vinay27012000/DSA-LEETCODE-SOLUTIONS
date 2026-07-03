class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int []result = nums.clone();
        int size = nums.length;

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
    
        // Map<Integer,Integer> map = new HashMap<>();
        // Arrays.sort(result);
        // for(int i=0;i<size;i++){
        //     if(!map.containsKey(result[i]))
        //         map.put(result[i], i);
        // }
        // for(int i=0;i<size;i++){
        //     result[i]=map.getOrDefault(nums[i],0);
        // }

        int allNo[] = new int[101];
        for (int i=0;i<size;i++){
            allNo[nums[i]]++;
        }
        for (int i=1;i<101;i++){
            allNo[i] += allNo[i-1];
        }
        for(int i=0;i<size;i++){
            if(nums[i]==0){
                result[i] = 0;
            } else {
            result[i]=allNo[nums[i]-1];
            }
        }
    return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna