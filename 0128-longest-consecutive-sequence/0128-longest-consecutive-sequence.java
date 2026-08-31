class Solution {
    public int longestConsecutive(int[] nums) {
         if (nums.length == 0) {
            return 0;
        }
        int min = nums[0];
        int max = nums[0];

        for (int num : nums){
            max = Math.max(num, max);
            min = Math.min(num, min);
        }

        if (max < 100000) {
            boolean [] apariciones = new boolean [max - min + 1];
            for (int num : nums) {
                apariciones[num - min] = true;
            }

            int maxTotal = 0;
            int maxLocal = 0;
            for (boolean a : apariciones) {
                if (a) {
                    maxLocal++;
                } else {
                    maxTotal = Math.max(maxTotal, maxLocal);
                    maxLocal = 0;
                }
            }
            maxTotal = Math.max(maxTotal, maxLocal);
            return maxTotal;
        } else {
            Set<Integer> uniNums = new HashSet();
            for( int num : nums ){
                uniNums.add(num);
            }

            int maxB = 0;
            for ( int num : uniNums ){
                if (!uniNums.contains(num - 1)){
                    int endSeq = num;
                    while (uniNums.contains(endSeq+1)){
                        endSeq++;
                    }
                    maxB = Math.max(maxB, endSeq - num + 1);
                }
            }
            return maxB;
        }
    }
}
// class Solution {
//     public int longestConsecutive(int[] nums) {
//         if(nums.length==0){
//             return 0;
//         }
//         Arrays.sort(nums);
//         int max=1;
//         int count=1;
//         for(int i=1;i<nums.length;i++){
//             if(nums[i]==nums[i-1]){
//                 continue;
//             }
//             if(nums[i]==nums[i-1]+1){
//                 count++;
//             }else{
//                 max = Math.max(max,count);
//                 count=1;
//             }
//         }
//         return Math.max(max,count);
//     }
// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna