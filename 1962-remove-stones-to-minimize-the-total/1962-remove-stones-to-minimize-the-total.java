class Solution {
    public int minStoneSum(int[] piles, int k) {
        int sum=0;
        PriorityQueue <Integer> pile =new PriorityQueue<>((a,b)->b-a);
        for(int x:piles){
            pile.add(x);
        }
        while(k>0)
        {
          int no=pile.poll();
            pile.add(no-(no/2));
            k--;
        }
        // while(!pile.isEmpty()){
        //     sum+=pile.poll();
        // }
        for(int x:pile)
            sum+=x;
        
        return sum;
    }
}