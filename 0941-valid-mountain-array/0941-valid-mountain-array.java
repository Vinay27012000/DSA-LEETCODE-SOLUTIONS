class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3) return false;
        boolean mid = false;
        if((arr[0] >= arr[1])) return false;

        for (int i=1;i<arr.length-1;i++){
            if (arr[i] == arr[i+1]) return false;
            if ((arr[i]>arr[i+1]) && (mid == false)){
                mid = true;
            }
            if (mid) {
                if(arr[i]<arr[i+1]) return false;
            }
        }
        return mid;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna