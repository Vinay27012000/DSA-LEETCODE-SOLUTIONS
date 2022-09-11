class Solution {
     public String convert(String s, int row) {
//         int l = s.length();
//         String c = "";
//         if (numRows == 1) {
//             return s;
//         }
	
//         for (int i = 0; i < numRows; i++) {
//             if (i == 0 || i == numRows - 1) {
//                 for (int j = i; j < l; j += 2 * (numRows - 1)) {
//                     c = c + s.charAt(j);
//                 }
//             } else {
		
//                 int j = i;
//                 while (j < l) {
//                     c = c + s.charAt(j);
//                     j += 2 * (numRows - i - 1);
//                     if (j >= l) {
//                         break;
//                     }
//                     c = c + s.charAt(j);
//                     j += 2 * i;
//                 }
//             }
//         }
//         return c;
//     }
         
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