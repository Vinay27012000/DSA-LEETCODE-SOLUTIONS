class Solution {
    public int removeDuplicates(int[] arr) {
    
        int j = 0;
int n=arr.length;
        for (int i = 0; i<n-1; i++)
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];
      
        arr[j++] = arr[n-1];
      
        return j;
    
    } 
}