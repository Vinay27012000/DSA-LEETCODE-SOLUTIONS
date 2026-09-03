class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
      
            int a= check('F',answerKey,k);
    int b=  check('T',answerKey,k);
     return (int)Math.max(a,b);


       
    }
    public static int check(char ch,String answerKey, int k){
        int l=0;
        int r=0;
        int maxc=0;
        int tc=0;
        for(r=0;r<answerKey.length();r++){
            if(answerKey.charAt(r)==ch)
             tc++;
             while(tc>k){
                if(answerKey.charAt(l)==ch)
                 tc--;
                 l++;
             }
             maxc=(int)Math.max(maxc,r-l+1);
        }
        return maxc;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna