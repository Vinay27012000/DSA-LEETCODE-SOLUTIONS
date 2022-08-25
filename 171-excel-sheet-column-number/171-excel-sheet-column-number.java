class Solution {
    public int titleToNumber(String columnTitle) {
        
        double t=0;
    int len=columnTitle.length();
	
	for(int j=0;j<len;j++)
   {
		t+=Math.pow(26, (len-j-1))*(columnTitle.charAt(j)-64);        
   }
	
	return (int) t;
    
}
}