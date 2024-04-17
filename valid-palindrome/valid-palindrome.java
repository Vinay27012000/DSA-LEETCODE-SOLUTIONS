class Solution {
    public boolean isPalindrome(String s) {

        String st="";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)<=90 && s.charAt(i)>=65) || (s.charAt(i)<=122 && s.charAt(i)>=97) || (s.charAt(i)<=57 && s.charAt(i)>=48) )
            {st=st+s.charAt(i);
            }
           
        }
        st=st.toLowerCase();
        int n=st.length();
        
         for(int i=0;i<n;i++){
             if(st.charAt(i)!=st.charAt(--n))
                 return false;
         }
            return true;
    }
}