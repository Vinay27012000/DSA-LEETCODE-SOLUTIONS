class Solution {
    public int maximum69Number (int num) {
        int arr[];
        int n=num,len=0;
        while(n>0){
            n=n/10;
            len++;
        }
        arr=new int[len];
        n=num;
        for(int i=len-1;n>0;i--,n/=10){
            arr[i]=n%10;
        }
        for(int i=0;i<len;i++){
            if(arr[i]==6){
                arr[i]=9;
                break;
            }
        }
        
         for(int j=0;j<len;j++){
                    n=n*10 + arr[j];
                }
        return n;
    }
}