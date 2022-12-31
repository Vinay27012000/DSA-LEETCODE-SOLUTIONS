class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue <Integer> heap =new PriorityQueue<>(Collections.reverseOrder());
        for(int x:nums)
        {
            heap.add(x);
        }
        int max=1;
        max*=heap.poll()-1;
        max*=heap.poll()-1;
        return max;
    }
}