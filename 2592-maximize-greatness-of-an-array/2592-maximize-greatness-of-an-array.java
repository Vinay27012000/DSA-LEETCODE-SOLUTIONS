class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        Queue<Integer> temp = new ArrayDeque<>();
        for (int i=nums.length-1;i>0;i--) {
            if(nums[i]>nums[i-1]) {
                count++;
            } else if (nums[i] == nums[i-1]){
                if(!temp.isEmpty() && temp.peek()>nums[i-1]){
                    count++;
                    temp.poll();
                }
                temp.offer(nums[i]);
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna