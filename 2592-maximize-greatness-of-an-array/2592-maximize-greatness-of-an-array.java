class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int p1=0,p2=1; 

        while(p2<nums.length){
            if(nums[p1]<nums[p2]) {
                count++;
                p1++;
            }
            p2++;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna