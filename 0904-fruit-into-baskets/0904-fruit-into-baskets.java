class Solution {
    public int totalFruit(int[] fruits) {
        if (fruits.length < 3) return fruits.length;

        int b1 = fruits[0];
        int b2 = -1;

        int p1 = 0;          // start of current window
        int last = 0;        // start of last continuous block
        int maxFruits = 0;

        for (int i = 1; i < fruits.length; i++) {

            if (fruits[i] == fruits[i - 1]) {
                continue;
            }

            if (b2 == -1) {
                b2 = fruits[i];
            } else if (fruits[i] != b1 && fruits[i] != b2) {
                maxFruits = Math.max(maxFruits, i - p1);

                p1 = last;

                b1 = fruits[last];
                b2 = fruits[i];
            }

            last = i;
        }

        return Math.max(maxFruits, fruits.length - p1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna