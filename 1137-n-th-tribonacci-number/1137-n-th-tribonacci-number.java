class Solution {
    public int tribonacci(int n) {
        int a,b,c;
        a=0;b=1;c=1;
        int result=0;
        if(n==0)return 0;
        if(n<3)return 1;
        for(int i=n;i>=3;i--){
            result=a+b+c;
            a=b;
            b=c;
            c=result;
        }
        return result;
    }
}