class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
     
        int d,h,len,i;
        len=temperatures.length;
        int [] ans=new int[len];        
        for(i=0;i<len-1;i++){
            d=1;
            if(temperatures[i]<temperatures[i+1])
            {
             ans[i]=1;   
            }
            else{
                int j=i+1;
                h=temperatures[i];
                while(j<len)
                {
                    if(h<temperatures[j]){
                    h=temperatures[j];
                    break;
                }
                 else{
                     d++;j++;
                 }
                }
                if(h==temperatures[i])
                ans[i]=0;
                else
                    ans[i]=d;
            }
        }
        ans[i]=0;
        return ans;
    }
}