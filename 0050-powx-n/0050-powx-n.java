class Solution {
    public double myPow(double x, int n) {
        if(n == 0)
            return 1;
        if(n<0){
            return 1/x * myPow(1/x, -(n + 1));
        }
        return (n%2 == 0) ? myPow(x*x, n/2) : x*myPow(x*x, n/2);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna