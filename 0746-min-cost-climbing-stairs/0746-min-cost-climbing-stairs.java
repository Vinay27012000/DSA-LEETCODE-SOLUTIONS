class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int back = cost[0];
        int front = cost[1];
        for(int i = 2; i < cost.length; ++i){
            int temp = Math.min(front, back) + cost[i];
            back = front;
            front = temp;
        }
        return Math.min(front, back);
    }

}