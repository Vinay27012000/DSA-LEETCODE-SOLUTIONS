class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        for(int i=0;i<n;i++){
            char ch=s[i];
            s[i]=s[--n];
            s[n]=ch;
        }
    }
}