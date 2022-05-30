class Solution {
   
    public int totalMoney(int n) {
        int i,sum=1,j=2,x=1;
        for(i=1;i<n;i++){
            if(i%7==0){
                j=++x;
                sum+=(j++);   
               }
            else
            {sum+=(j++);}
        }
           
        return sum;
    }
}