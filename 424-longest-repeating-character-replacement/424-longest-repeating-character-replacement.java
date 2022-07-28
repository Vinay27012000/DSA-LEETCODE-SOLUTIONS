class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int maxfre = 0;
        int length = 0;
        int start = 0 ;
        int end = 0;
        while(end < s.length()){
		
            int check = s.charAt(end) - 'A';  //present character
            arr[check]++;   // adding count to character history 
			
			//maxfrequency of character which appear most in present window
            maxfre = Math.max(maxfre,arr[check]); 
         
			//logic :  length of present window  - maxfrequency character  should be smaller or equal to k
			// length of present window  - maxfrequency character is bigger than k, then increase start pointer
            if((end - start + 1)-maxfre>k){
                arr[s.charAt(start)-'A']--;

                start++;
            }
            length = Math.max(length ,end - start + 1);

            end++;

        }
        return length;
    }
}