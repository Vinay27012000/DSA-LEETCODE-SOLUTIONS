class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3) return false;
        // boolean mid = false;
        // if((arr[0] >= arr[1])) return false;

        // for (int i=1;i<arr.length-1;i++){
        //     if (arr[i] == arr[i+1]) return false;
        //     if ((arr[i]>arr[i+1]) && (mid == false)){
        //         mid = true;
        //     }
        //     if (mid) {
        //         if(arr[i]<arr[i+1]) return false;
        //     }
        // }
        // return mid;
    
        int l=0,r=arr.length-1;
        while(l+1 < arr.length-1 && arr[l]<arr[l+1])l++;
        while(r-1 > 0 && arr[r]<arr[r-1]) r--;
            
    return l==r;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna