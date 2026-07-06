class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count =0;
        for (int i=0;i<arr1.length;i++) {
            int num = arr1[i];
            boolean check = false;
            for (int j=0;j<arr2.length;j++) {
                if(Math.abs(num - arr2[j]) <= d){
                    check = true;
                    break;
                }
            }
            if (check) {
                count++;
            }
        }
        return arr1.length - count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna