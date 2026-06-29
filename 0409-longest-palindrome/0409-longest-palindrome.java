class Solution {
    public int longestPalindrome(String s) {
        if (s.length() == 1) return 1;
        Map<Character, Integer> keySet = new HashMap<>();
        for (char c : s.toCharArray()) {
            keySet.merge(c, 1, Integer::sum);
        }
        boolean hasOdd =false;
        int result =0;
        for(Integer count : keySet.values()){
            if (count%2 == 0){
                result+=count;
            } else {
                result += count - 1;
                hasOdd = true;
            }
        }
        if(hasOdd) result++;
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna