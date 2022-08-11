class Solution {
    public void rotate(int[][] a) {
        
   int n = a.length;
    
   int i =0;
    int p=n/2,round=n-1;
    int cround= round;
    while(p>0)
    {
       int topLeft=i,topRight=i, bottomLeft=n-i-1, bottomRight=n-i-1,temp1,temp2;
        
    while(round>0)
    {
      
        temp2 = a[topRight][n-i-1];
        a[topRight][n-i-1]=a[i][topLeft];

        temp1=a[n-i-1][bottomRight];
        a[n-i-1][bottomRight]= temp2;

        temp2=a[bottomLeft][i];
        a[bottomLeft][i]=temp1;

        a[i][topLeft]=temp2;

        topRight++;
        topLeft++;
        bottomRight--;
        bottomLeft--;
        
        round--;

    }
    i++;
    p--;
    round= cround-2;
    cround-=2;
    
}
   
}  
}