class Solution {
    public int maxScore(int[] c, int k) {
        int p=c.length;
        for(int i=1;i<p;i++)
        {
            c[i]=c[i]+c[i-1];
        }
        if(k==p)
            return c[k-1];
        int s=Integer.MIN_VALUE;
        for(int i=0;i<=k;i++)
        {
            int f=0;
            if(i>0)
                f=c[p-k+i-1]-c[i-1];
            else
                f=c[p-k-1];
            f=c[p-1]-f;
            s=Math.max(f,s);
        }
        return s;
    }
}