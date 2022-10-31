class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] chars = new int[127];
        int j = 0; 
        int ans = 0; 
        
        for(int i=0; i<s.length(); i++) { 
            int code = (int) s.charAt(i);
            if (chars[code] != 0) { 
                j = Math.max(chars[code], j);
            }
            ans = Math.max(ans, i-j+1);
            chars[code] = i+1; 
        }
        
        return ans; 
    }
}
