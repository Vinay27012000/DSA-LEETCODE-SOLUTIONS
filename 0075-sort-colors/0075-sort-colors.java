class Solution {
    public void sortColors(int[] nums) {
        int []arr = new int[3];
        for (int i=0;i<nums.length;i++) {
            arr[nums[i]]++;
        }
        int i =0;
        int num =0;
        while(i<nums.length) {
           if (arr[0]-- > 0){
            num = 0;
           } else if (arr[1]-- > 0){
            num = 1;
           } else if (arr[2]-- > 0){
            num = 2;
           }
           nums[i++] = num;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna