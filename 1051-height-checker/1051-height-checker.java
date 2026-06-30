class Solution {
    public int heightChecker(int[] heights) {
        int[] new1 = new int[heights.length];
        for(int i=0;i<heights.length;i++)
            new1[i]= heights[i];
        Arrays.sort(new1);
        int count =0;
        for (int i=0;i<heights.length;i++){
            if (heights[i]!=new1[i])
                count++;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna