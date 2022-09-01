class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        Stack<Integer>stack=new Stack<>();
        int res[]=new int[n];
        Arrays.fill(res,0);
        for(int i=n-1;i>=0;i--)
        {
           
            while(!stack.isEmpty() && temperatures[i]>=temperatures[stack.peek()])
            {
                stack.pop();
            }
                if(!stack.isEmpty())
                {
                    res[i]=stack.peek()-i;
                }
            stack.push(i);
        }
        return res;
    }
}