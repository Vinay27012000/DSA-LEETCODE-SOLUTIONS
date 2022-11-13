class Solution {
    public String reverseWords(String s) {
        int i,j;
        String result="";
        i=s.length()-1;
        
        while(i>=0){
            while(i>=0 && s.charAt(i)==' ')
                i--;
             if(i<0) break;
            j=i;
            while(i>=0 && s.charAt(i)!=' ')
                i--;
            if(result.isEmpty()){
                result+=s.substring(i+1,j+1);
            }
            else{
                result+=" "+s.substring(i+1,j+1);
            }
        }
        return result;
        
    }
}

