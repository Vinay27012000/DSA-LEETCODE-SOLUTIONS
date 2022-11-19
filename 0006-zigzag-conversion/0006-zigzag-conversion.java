class Solution {
    public String convert(String s, int row) {
  int len=s.length();
         String c="";
         
            if(row==1)
             return s;
         
         for(int i=0;i<row;i++){
             
             if(i==0||i==row-1){
                 for(int j=i;j<len;j+=2*(row-1)){
                     c=c+s.charAt(j);
                 }
             }
             else{int j=i;
             while(j<len){
             c=c+s.charAt(j);
                 j+=2*(row-i-1);
                 if(j>=len){
                     break;
                 }
                 c=c+s.charAt(j);
                 j+=2*i;
             }
             }
             
         }
	return c;
     }
}