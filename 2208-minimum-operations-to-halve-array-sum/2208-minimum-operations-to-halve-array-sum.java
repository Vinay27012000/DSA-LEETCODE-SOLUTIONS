class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue <Double> que = new PriorityQueue<>(Collections.reverseOrder());
        
        Double half;
        Double sum=0.00;
        for(int i =0;i<nums.length;i++)
        {que.add(Double.valueOf(nums[i]));
         sum+=Double.valueOf(nums[i]);
        }
        
        half=sum/2;
        int count=0;
       while(half>0.0)
       {
           
           Double x=que.poll()/2;
           que.add(x);
           half-=x;
           count++;
       }
        
        return count;
    }
}