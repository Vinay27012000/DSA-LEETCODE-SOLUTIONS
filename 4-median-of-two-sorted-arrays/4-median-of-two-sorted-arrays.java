class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size=nums1.length+nums2.length,i=0,mid=Integer.MAX_VALUE;
        int ans[]=new int[size];
        double result=0;
        for(int data:nums1)
            ans[i++]=data;
        for(int data:nums2)
            ans[i++]=data;

          Arrays.sort(ans);

        mid=size/2;
        if(size%2 == 0){  
            result=(ans[mid]+ans[mid-1])/2.0;
            return result;
        }
        else{
            result=ans[mid];
            return result;
        }
        
    }
}