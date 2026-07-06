class Solution {
    public int countLargestGroup(int n) {
    int[] count = new int[37];
        int maxSize = 0;

        for (int i = 1; i <= n; i++) {
            int sum = getDigitSum(i);
            count[sum]++;
            maxSize = Math.max(maxSize, count[sum]);
        }

        int result = 0;
        for (int c : count) {
            if (c == maxSize) {
                result++;
            }
        }
        return result;
    }

 
    public static int getDigitSum(int number) {
    int sum = 0;
    while (number != 0) {
        sum += number % 10;
        number /= 10;       
    }
    return Math.abs(sum);  
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna