class Solution {
    public int reverse(int x) {
        int num=0;
        if(x<0){
            num=x*-1;
        }
        else
            num=x;
        int rev=0;
        while(num>0){
            int r=num%10;
            if(rev>(Integer.MAX_VALUE-r)/10)
                return 0;
            rev=rev*10 + r;
            num/=10;
        }
        return (x<0)?(-rev):rev;
    }
}