class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int r=people.length-1;
        int l=0;
        int count = 0;
        while (l<r){
            if(people[l] + people[r] <= limit) {
                l++;
                r--;
            } else {
                r--;
            }
            count++;
        }
        if (l==r) count++;
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna