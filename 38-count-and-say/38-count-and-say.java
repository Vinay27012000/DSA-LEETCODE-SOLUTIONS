class Solution {
    public String countAndSay(int N) {

       if(N==1)
           return "1";
        
        String str = countAndSay(N-1); 
        
        int n = str.length();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            int count = 1;
            
            while(i<n-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            
            sb.append(count);
            sb.append(ch);
        }
    
        return sb.toString();
    }
}