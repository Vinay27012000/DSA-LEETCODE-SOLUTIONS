class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
     
        List<Integer> result = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(); 
        for(int i=0;i<k;i++) 
            pq.add(arr[i]);

        for(int j = k;j<arr.length;j++) {
            if (Math.abs(arr[j]-x) < Math.abs(x-pq.peek()))
            {
                pq.poll();
                pq.add(arr[j]);
            }
        }
        for (int i=0;i<k;i++){
            result.add(pq.poll());
        }       
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna