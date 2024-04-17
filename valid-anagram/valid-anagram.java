class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int f1[]=new int[26];
        int f2[]=new int [26];
        
        for(char c:s.toCharArray()) f1[c-'a']++;
        for(char c:t.toCharArray()) f2[c-'a']++;
        
        for(int i=0;i<26;i++){
            if(f1[i]!=f2[i])
                return false;
        }
        return true;
    }
}