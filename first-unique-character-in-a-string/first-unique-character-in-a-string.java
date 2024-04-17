class Solution {
    public int firstUniqChar(String s) {
     int fr[]=new int[26];
        
        for(char c:s.toCharArray())
            fr[c-'a']++;
        for(int i=0;i<s.length();i++){
            if(fr[s.charAt(i)-'a'] == 1)
                return i;
        }
        return -1;
    }
}