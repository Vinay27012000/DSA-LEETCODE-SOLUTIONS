class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        if(len==0) return "";
        if(len==1) return s;
        if(len==2) {
            if(s.charAt(0)==s.charAt(1))
                return s;
            else
                return s.substring(0,1);
        }
        int maxLen = 0;
        int startIndex = -1;
        boolean found = false;
        for(int i=1; i<len; i++) {
            int l = i-1;
            int r = i+1;
            while(l>=0 && r<len) { // odd length
                if(l>=0 && r<len && s.charAt(l) == s.charAt(r)) {
                    l--;
                    r++;
                    found = true;
                } else {
                    break;
                }
            }
            if(r-l>2 && maxLen < r-l-1) {
                maxLen = r-l-1;
                startIndex = l+1;
            }
            if(s.charAt(i-1)==s.charAt(i)) { // even length
                l = i-1;
                r = i;
                while(l>=0 && r<len) {
                  if(l>=0 && r<len && s.charAt(l) == s.charAt(r)) {
                    l--;
                    r++;
                    found = true;
                  } else {
                      break;
                  }
                }
                if(r-l>=2 && maxLen < r-l-1) {
                    maxLen = r-l-1;
                    startIndex = l+1;
                }
            }
        }
        return found ? s.substring(startIndex, startIndex+maxLen) : s.substring(0,1);
    }
}